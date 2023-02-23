package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


public interface IPortatilesController {
	
		
	/**
	 * Navigate to create form portatil.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToCreateFormPortatil() throws Exception;
		
	
	
	
	/**
	 * Delete portatil.
	 *
	 * @param portatil_id the portatil id
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView deletePortatil(@RequestParam long portatil_id) throws Exception;
	
}