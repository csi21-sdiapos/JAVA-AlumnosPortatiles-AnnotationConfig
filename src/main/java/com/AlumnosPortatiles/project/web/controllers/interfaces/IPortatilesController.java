package com.AlumnosPortatiles.project.web.controllers.interfaces;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


public interface IPortatilesController {
	
		
	/**
	 * Navigate to create form portatil.
	 *
	 * @return the model and view
	 */
	public ModelAndView navigateToCreateFormPortatil();
	
	

	/**
	 * Find alumno by portatil id.
	 *
	 * @param portatil_id the portatil id
	 * @param model the model
	 * @return the string
	 */
	public String findAlumnoByPortatilId(@RequestParam long portatil_id, Model model);
	
	
	
	
	/**
	 * Edits the portatil.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	public ModelAndView editPortatil(HttpServletRequest request);
	//public ModelAndView navigateToEditFormPortatil(@RequestParam long portatil_id);
	
	
	
	/**
	 * Delete portatil.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	public ModelAndView deletePortatil(HttpServletRequest request);
	
}