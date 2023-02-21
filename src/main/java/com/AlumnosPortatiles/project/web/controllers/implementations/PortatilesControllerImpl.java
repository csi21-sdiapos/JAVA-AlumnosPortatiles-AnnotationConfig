package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.app.repositories.implementations.PortatilRepositoryImpl;
import com.AlumnosPortatiles.project.repositories.interfaces.IPortatilRepository;
import com.AlumnosPortatiles.project.web.controllers.interfaces.IPortatilesController;


@Controller(value = "PortatilesControllerImpl")
public class PortatilesControllerImpl implements IPortatilesController {

	
	protected final Log logger = LogFactory.getLog(getClass());
	
	IPortatilRepository portatilRepository = new PortatilRepositoryImpl();
	
	
	
	@RequestMapping(value = "/portatilesListLoader")
	@Override
	public ModelAndView portatilesListLoader() throws Exception {
		logger.info("Entrando en el metodo --> portatilesListLoader()");
		List<Portatil> portatilesList = new ArrayList<>();
		
		try {
			portatilesList = portatilRepository.listPortatiles();
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de portatiles: " + e);
		}
		
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		return new ModelAndView("portatiles", "listaPortatiles", portatilesList);
	}

	
	
	@RequestMapping(value = "/navigateToCreateFormPortatil")
	@Override
	public String navigateToCreateFormPortatil(Model model) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de portailes, pasando un objeto Portatil");
		
		Portatil portatilModel = new Portatil();
		model.addAttribute("portatilModel", portatilModel);
		
		return "createFormPortatil";
	}

}