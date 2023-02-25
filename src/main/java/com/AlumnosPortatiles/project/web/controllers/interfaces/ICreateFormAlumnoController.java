package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Alumno;


public interface ICreateFormAlumnoController {

	
	/**
	 * Form create alumno.
	 *
	 * @param alumnoModel the alumno model
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView formCreateAlumno(@ModelAttribute("alumnoModel") Alumno alumnoModel) throws Exception;

}