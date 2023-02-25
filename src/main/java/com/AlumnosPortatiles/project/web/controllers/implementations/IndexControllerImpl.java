package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.controllers.interfaces.IIndexController;
import com.AlumnosPortatiles.project.web.dto.implementations.AlumnoToDTOimpl;
import com.AlumnosPortatiles.project.web.dto.implementations.PortatilToDTOimpl;
import com.AlumnosPortatiles.project.web.dto.interfaces.IAlumnoToDTO;
import com.AlumnosPortatiles.project.web.dto.interfaces.IPortatilToDTO;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;
import com.AlumnosPortatiles.project.web.services.implementations.AlumnoServiceImpl;
import com.AlumnosPortatiles.project.web.services.implementations.PortatilServiceImpl;
import com.AlumnosPortatiles.project.web.services.interfaces.IAlumnoService;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Controller(value = "IndexControllerImpl")
public class IndexControllerImpl implements IIndexController {

	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();
	
	
	
	@RequestMapping(value="/navigateToAlumnos")
	@Override
	public ModelAndView navigateToAlumnos() throws Exception {
		logger.info("\nNavegamos a la vista de Alumnos");
		
		List<Alumno> alumnosList = new ArrayList<>();
		try {
			alumnosList = alumnoService.listarAlumnos();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de alumnos: " + e);
		}
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		
		List<AlumnoDTO> alumnosListDTO = alumnoToDTO.toListAlumnoDTO(alumnosList);
		return new ModelAndView("alumnos", "listaAlumnos", alumnosListDTO);
	}

	
	
	@RequestMapping(value="/navigateToPortatiles")
	@Override
	public ModelAndView navigateToPortatiles() throws Exception {
		logger.info("\nNavegamos a la vista de Portatiles");
		
		List<Portatil> portatilesList = new ArrayList<>();
		try {
			portatilesList = portatilService.listarPortatiles();	
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de portatiles: " + e);
		}
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);
		return new ModelAndView("portatiles", "listaPortatiles", portatilesListDTO);
	}

}