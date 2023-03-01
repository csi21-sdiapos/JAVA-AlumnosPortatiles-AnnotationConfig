package com.AlumnosPortatiles.project.web.controllers.interfaces;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;


public interface IEditFormPortatilController {

	
	public ModelAndView formEditPortatil(HttpServletRequest request);
	//public ModelAndView formEditPortatil(@ModelAttribute("portatilModel") Portatil portatilModel);
}