package com.AlumnosPortatiles.project.web.controllers.implementations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.controllers.interfaces.IPortatilesController;
import com.AlumnosPortatiles.project.web.services.implementations.PortatilServiceImpl;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Controller(value = "PortatilesControllerImpl")
public class PortatilesControllerImpl implements IPortatilesController {

	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();

	
	
	@RequestMapping(value = "/navigateToCreateFormPortatil")
	@Override
	public ModelAndView navigateToCreateFormPortatil() throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de portailes, pasando un objeto Portatil");
		
		Portatil portatil = new Portatil();
		
		return new ModelAndView("createFormPortatil", "portatilModel", portatil);
	}

}