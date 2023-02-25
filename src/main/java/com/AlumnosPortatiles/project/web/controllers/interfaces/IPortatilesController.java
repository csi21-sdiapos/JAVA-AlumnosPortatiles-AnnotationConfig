package com.AlumnosPortatiles.project.web.controllers.interfaces;

import javax.servlet.http.HttpServletRequest;

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
	 * Edits the portatil.
	 *
	 * @param request the request
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView editPortatil(HttpServletRequest request) throws Exception;
	//public ModelAndView navigateToEditFormPortatil(@RequestParam long portatil_id) throws Exception;
	
	
	
	/**
	 * Delete portatil.
	 *
	 * @param request the request
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView deletePortatil(HttpServletRequest request) throws Exception;
	
}