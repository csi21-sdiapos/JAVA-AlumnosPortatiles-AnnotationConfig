package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Portatil;


public interface ICreateFormPortatilController {

	
	/**
	 * Form create portatil.
	 *
	 * @param portatilModel the portatil model
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView formCreatePortatil(@ModelAttribute("portatilModel") Portatil portatilModel) throws Exception;
	
}