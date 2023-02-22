package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.servlet.ModelAndView;


public interface IAlumnosController {
	
	
	/**
	 * Navigate to create form alumno.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToCreateFormAlumno() throws Exception;
	
}