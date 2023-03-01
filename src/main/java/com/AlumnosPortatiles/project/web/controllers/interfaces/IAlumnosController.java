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
	 */
	public String navigateToCreateFormAlumno(Model model);
	
	
	
	/**
	 * Find portatil by alumno id.
	 *
	 * @param alumno_id the alumno id
	 * @param model the model
	 * @return the string
	 */
	public String findPortatilByAlumnoId(@RequestParam long alumno_id, Model model);
	
	
	
	/**
	 * Navigate to edit form alumno.
	 *
	 * @param alumno_id the alumno id
	 * @return the model and view
	 */
	public ModelAndView navigateToEditFormAlumno(@RequestParam long alumno_id);
	// public ModelAndView editAlumno(HttpServletRequest request);
	
	
	
	
	/**
	 * Delete alumno.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	public ModelAndView deleteAlumno(HttpServletRequest request);
	
}