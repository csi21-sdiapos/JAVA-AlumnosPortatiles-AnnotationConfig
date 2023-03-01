package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;


public interface ICreateFormAlumnoController {

	
	/**
	 * Form create alumno.
	 *
	 * @param alumnoModel the alumno model
	 * @return the model and view
	 */
	public ModelAndView formCreateAlumno(@ModelAttribute("alumnoModel") AlumnoDTO alumnoModel);

}