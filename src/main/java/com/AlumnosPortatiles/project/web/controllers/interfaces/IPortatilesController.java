package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


public interface IPortatilesController {

	
	/**
	 * Portatiles list loader.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView portatilesListLoader() throws Exception;
	
	
	
	/**
	 * Navigate to create form portatil.
	 *
	 * @param model the model
	 * @return the string
	 * @throws Exception the exception
	 */
	public String navigateToCreateFormPortatil(Model model) throws Exception;
	
}