package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.Calendar;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.app.repositories.implementations.PortatilRepositoryImpl;
import com.AlumnosPortatiles.project.repositories.interfaces.IPortatilRepository;
import com.AlumnosPortatiles.project.web.controllers.interfaces.ICreateFormPortatil;


@Controller(value = "CreateFormPortatilImpl")
public class CreateFormPortatilImpl implements ICreateFormPortatil {
	
	
	protected final Log logger = LogFactory.getLog(getClass());

	IPortatilRepository portatilRepository = new PortatilRepositoryImpl();
	
	
	
	@RequestMapping(value="/formCreatePortatil", method = RequestMethod.POST)
	@Override
	public String formCreatePortatil(Portatil portatilModel) throws Exception {
		logger.info("\nEntrando en el metodo --> formCreatePortatil()");
		
		portatilModel.setPortatil_uuid(UUID.randomUUID());
		portatilModel.setPortatil_date(Calendar.getInstance());
		portatilRepository.insertPortatil(portatilModel);
		
		return "alumnos";
	}

}