package com.AlumnosPortatiles.project.web.controllers.implementations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.AlumnosPortatiles.project.web.controllers.interfaces.IIndexController;


@Controller(value = "IndexControllerImpl")
public class IndexControllerImpl implements IIndexController {

	
	protected final Log logger = LogFactory.getLog(getClass());
	
	
	
	@RequestMapping(value="/navigateToAlumnos")
	@Override
	public String navigateToAlumnos() throws Exception {
		logger.info("\nNavegamos a la vista de Alumnos");
		return "alumnos";
	}

	
	
	@RequestMapping(value="/navigateToPortatiles")
	@Override
	public String navigateToPortatiles() throws Exception {
		logger.info("\nNavegamos a la vista de Portatiles");
		return "portatiles";
	}

}