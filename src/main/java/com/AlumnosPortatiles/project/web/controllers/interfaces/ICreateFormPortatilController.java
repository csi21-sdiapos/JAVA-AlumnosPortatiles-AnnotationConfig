package com.AlumnosPortatiles.project.web.controllers.interfaces;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;


public interface ICreateFormPortatilController {

	
	/**
	 * Form create portatil.
	 *
	 * @param portatilModel the portatil model
	 * @return the model and view
	 */
	public ModelAndView formCreatePortatil(@ModelAttribute("portatilModel") PortatilDTO portatilModel);
	
}