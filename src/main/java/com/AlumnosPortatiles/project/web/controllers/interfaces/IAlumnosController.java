package com.AlumnosPortatiles.project.web.controllers.interfaces;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


public interface IAlumnosController {
	
	
	
	/**
	 * Navigate to create form alumno.
	 *
	 * @param model the model
	 * @return the string
	 * @throws Exception the exception
	 */
	public String navigateToCreateFormAlumno(Model model) throws Exception;
	
	
	
	/**
	 * Navigate to edit form alumno.
	 *
	 * @param alumno_id the alumno id
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToEditFormAlumno(@RequestParam long alumno_id) throws Exception;
	// public ModelAndView editAlumno(HttpServletRequest request) throws Exception;
	
	
	
	
	/**
	 * Delete alumno.
	 *
	 * @param request the request
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView deleteAlumno(HttpServletRequest request) throws Exception;
	
}