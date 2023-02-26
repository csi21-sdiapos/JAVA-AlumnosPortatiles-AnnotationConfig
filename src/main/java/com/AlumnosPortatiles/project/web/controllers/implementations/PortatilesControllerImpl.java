package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.controllers.interfaces.IPortatilesController;
import com.AlumnosPortatiles.project.web.dto.implementations.PortatilToDTOimpl;
import com.AlumnosPortatiles.project.web.dto.interfaces.IPortatilToDTO;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;
import com.AlumnosPortatiles.project.web.services.implementations.PortatilServiceImpl;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Controller(value = "PortatilesControllerImpl")
@RequestMapping(value = { "", "portatil" })
public class PortatilesControllerImpl implements IPortatilesController {

	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();

	
	
	@RequestMapping(value = "/navigateToCreateFormPortatil")
	@Override
	public ModelAndView navigateToCreateFormPortatil() throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de portatiles, pasando un objeto Portatil");
		PortatilDTO portatilDTO = new PortatilDTO();
		
		return new ModelAndView("createFormPortatil", "portatilModel", portatilDTO);
	}
	
	
/*
	@Override
	public String findAlumnoByPortatilId(@RequestParam long portatil_id, Model model) throws Exception {
		logger.info("\nVamos a buscar un alumno a través del id de un portatil");
		
		Portatil portatil = portatilService.buscarPortatilPorId(portatil_id);
		Alumno alumno = portatil.getAlumno();
		model.addAttribute("alumnoModel", alumno);
		
		List<Portatil> portatilesList = new ArrayList<>();
		try {
			portatilesList = portatilService.listarPortatiles();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de portatiles: " + e);
		}
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		model.addAttribute("listaPortatiles", portatilesList);
		
		return "portatiles";
	}
*/
	
	
	@RequestMapping(value = "/editPortatil")
	@Override
	public ModelAndView editPortatil(HttpServletRequest request) throws Exception {
		logger.info("\nEntrando en el metodo --> editPortatil()");
		
		long id = Long.parseLong(request.getParameter("id"));
		Portatil portatil = portatilService.buscarPortatilPorId(id);
		portatil.setPortatil_marca(request.getParameter("marca").trim());
		portatil.setPortatil_modelo(request.getParameter("modelo").trim());
		portatilService.editarPortatil(portatil.getPortatil_id(), portatil.getPortatil_marca(), portatil.getPortatil_modelo());
		
		List<Portatil> portatilesList = new ArrayList<>();
		try {
			portatilesList = portatilService.listarPortatiles();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de portatiles: " + e);
		}
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);
		return new ModelAndView("portatiles", "listaPortatiles", portatilesListDTO);
	}



	
	@RequestMapping(value = "/deletePortatil")
	@Override
	public ModelAndView deletePortatil(HttpServletRequest request) throws Exception {
		logger.info("\nEntrando en el metodo --> deletePortatil()");
		
		long id = Long.parseLong(request.getParameter("id"));
		portatilService.eliminarPortatilPorId(id);
		
		List<Portatil> portatilesList = new ArrayList<>();
		try {
			portatilesList = portatilService.listarPortatiles();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de portatiles: " + e);
		}
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);
		return new ModelAndView("portatiles", "listaPortatiles", portatilesListDTO);
	}

}