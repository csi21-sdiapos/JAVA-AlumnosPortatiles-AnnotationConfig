package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.servlet.ModelAndView;


public interface IIndexController {

	
	/**
	 * Navigate to alumnos.
	 *
	 * @return the model and view
	 */
	public ModelAndView navigateToAlumnos();
	
	
	
	/**
	 * Navigate to portatiles.
	 *
	 * @return the model and view
	 */
	public ModelAndView navigateToPortatiles();
	
}