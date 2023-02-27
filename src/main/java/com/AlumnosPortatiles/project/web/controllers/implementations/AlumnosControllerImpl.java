package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.controllers.interfaces.IAlumnosController;
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


@Controller(value = "AlumnosControllerImpl")
@RequestMapping(value = { "", "alumno" })
public class AlumnosControllerImpl implements IAlumnosController {
	

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();
	

	
	@RequestMapping(value = "/navigateToCreateFormAlumno")
	@Override
	public String navigateToCreateFormAlumno(Model model) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de alumnos, pasando un objeto Alumno");
		
		AlumnoDTO alumnoDTO = new AlumnoDTO();
		model.addAttribute("alumnoModel", alumnoDTO);
		
		List<Portatil> portatilesList = new ArrayList<>();
		try {
			portatilesList = portatilService.listarPortatiles();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de portatiles: " + e);
		}
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");

		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);
		model.addAttribute("listaPortatiles" ,portatilesListDTO);

		return "createFormAlumno";
	}
	
	

	@RequestMapping(value = "/findPortatilByAlumnoId")
	@Override
	public String findPortatilByAlumnoId(@RequestParam long alumno_id, Model model) throws Exception {
		logger.info("\nVamos a buscar un portatil a través del id de un alumno");
		
		Alumno alumno = alumnoService.buscarAlumnoPorId(alumno_id);
		model.addAttribute("alumnoModel", alumnoToDTO.toAlumnoDTO(alumno));
		Portatil portatil = alumno.getPortatil();
		model.addAttribute("portatilModel", portatilToDTO.toPortatilDTO(portatil));
		
		List<Alumno> alumnosList = new ArrayList<>();
		try {
			alumnosList = alumnoService.listarAlumnos();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de alumnos: " + e);
		}
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		
		List<AlumnoDTO> alumnosListDTO = alumnoToDTO.toListAlumnoDTO(alumnosList);
		model.addAttribute("listaAlumnos", alumnosListDTO);
		
		return "alumnos";
	}



	@RequestMapping(value = "/navigateToEditFormAlumno")
	@Override
	public ModelAndView navigateToEditFormAlumno(@RequestParam long alumno_id) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de edicion de alumnos, pasando un objeto Alumno");
		Alumno alumno = alumnoService.buscarAlumnoPorId(alumno_id);
		
		return new ModelAndView("editFormAlumno", "alumnoModel", alumno);
	}

	

	@RequestMapping(value = "/deleteAlumno")
	@Override
	public ModelAndView deleteAlumno(HttpServletRequest request) throws Exception {
		logger.info("\nEntrando en el metodo --> deleteAlumno()");

		long id = Long.parseLong(request.getParameter("id"));
		alumnoService.eliminarAlumnoPorid(id);
		
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

}