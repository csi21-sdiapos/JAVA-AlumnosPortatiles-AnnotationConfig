package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.controllers.interfaces.ICreateFormAlumnoController;
import com.AlumnosPortatiles.project.web.services.implementations.AlumnoServiceImpl;
import com.AlumnosPortatiles.project.web.services.implementations.PortatilServiceImpl;
import com.AlumnosPortatiles.project.web.services.interfaces.IAlumnoService;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Controller(value = "CreateFormAlumnoControllerImpl")
public class CreateFormAlumnoControllerImpl implements ICreateFormAlumnoController {

	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	

	
	@RequestMapping(value="/formCreateAlumno", method = RequestMethod.POST)
	@Override
	public ModelAndView formCreateAlumno(@ModelAttribute("alumnoModel") Alumno alumnoModel) throws Exception {
		logger.info("\nEntrando en el metodo --> formCreateAlumno()");
		Portatil portatil = portatilService.buscarPortatilPorId(alumnoModel.getPortatil_id());
		
		alumnoModel.setAlumno_uuid(UUID.randomUUID());
		alumnoModel.setAlumno_date(Calendar.getInstance());
		alumnoModel.setPortatil(portatil);
		alumnoService.insertarAlumno(alumnoModel);
		
		logger.info("\nVolvemos a la vista de los Alumnos");
		List<Alumno> alumnosList = new ArrayList<>();
		
		try {
			alumnosList = alumnoService.listarAlumnos();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de alumnos: " + e);
		}
		
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		return new ModelAndView("alumnos", "listaAlumnos", alumnosList);
	}

}