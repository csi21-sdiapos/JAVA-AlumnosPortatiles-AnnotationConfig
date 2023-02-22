package com.AlumnosPortatiles.project.web.controllers.implementations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.web.controllers.interfaces.IAlumnosController;
import com.AlumnosPortatiles.project.web.services.implementations.AlumnoServiceImpl;
import com.AlumnosPortatiles.project.web.services.interfaces.IAlumnoService;


@Controller(value = "AlumnosControllerImpl")
public class AlumnosControllerImpl implements IAlumnosController {
	

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	

	
	@RequestMapping(value = "/navigateToCreateFormAlumno")
	@Override
	public ModelAndView navigateToCreateFormAlumno() throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de alumnos, pasando un objeto Alumno");
		
		Alumno alumno = new Alumno();
        
		return new ModelAndView("createFormAlumno", "alumnoModel", alumno);
	}

}