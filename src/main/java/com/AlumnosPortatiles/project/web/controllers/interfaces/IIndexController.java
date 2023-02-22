package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.servlet.ModelAndView;


public interface IIndexController {

	
	/**
	 * Navigate to alumnos.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToAlumnos() throws Exception;
	
	
	
	/**
	 * Navigate to portatiles.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToPortatiles() throws Exception;
	
}