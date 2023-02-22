package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.AlumnosPortatiles.project.app.entities.Portatil;


public interface ICreateFormPortatilController {

	
	/**
	 * Form create portatil.
	 *
	 * @param portatilModel the portatil model
	 * @return the string
	 * @throws Exception the exception
	 */
	public String formCreatePortatil(@ModelAttribute("portatilModel") Portatil portatilModel) throws Exception;
	
}