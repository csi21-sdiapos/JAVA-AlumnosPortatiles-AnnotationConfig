package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


public interface IAlumnosController {

	
	/**
	 * Alumnos list loader.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView alumnosListLoader() throws Exception;
	
	
	
	/**
	 * Navigate to create form alumno.
	 *
	 * @param Model the model
	 * @return the string
	 * @throws Exception the exception
	 */
	public String navigateToCreateFormAlumno(Model model) throws Exception;
	
}