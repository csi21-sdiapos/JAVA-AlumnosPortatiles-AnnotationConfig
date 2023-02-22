package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.Calendar;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.controllers.interfaces.ICreateFormPortatilController;
import com.AlumnosPortatiles.project.web.services.implementations.PortatilServiceImpl;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Controller(value = "CreateFormPortatilControllerImpl")
public class CreateFormPortatilControllerImpl implements ICreateFormPortatilController {
	
	
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	
	
	@RequestMapping(value="/formCreatePortatil", method = RequestMethod.POST)
	@Override
	public String formCreatePortatil(Portatil portatilModel) throws Exception {
		logger.info("\nEntrando en el metodo --> formCreatePortatil()");
		
		portatilModel.setPortatil_uuid(UUID.randomUUID());
		portatilModel.setPortatil_date(Calendar.getInstance());
		portatilService.insertarPortatil(portatilModel);
		
		return "portatiles";
	}

}