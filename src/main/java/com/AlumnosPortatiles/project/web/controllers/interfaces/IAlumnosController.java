package com.AlumnosPortatiles.project.web.controllers.interfaces;

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
	// public ModelAndView editAlumno(@RequestParam long alumno_id) throws Exception;
	
	
	
	/**
	 * Delete alumno.
	 *
	 * @param alumno_id the alumno id
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView deleteAlumno(@RequestParam long alumno_id) throws Exception;
	
}