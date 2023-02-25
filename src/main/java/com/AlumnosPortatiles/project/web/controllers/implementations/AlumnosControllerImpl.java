package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.ArrayList;
import java.util.List;

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
import com.AlumnosPortatiles.project.web.services.implementations.AlumnoServiceImpl;
import com.AlumnosPortatiles.project.web.services.implementations.PortatilServiceImpl;
import com.AlumnosPortatiles.project.web.services.interfaces.IAlumnoService;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Controller(value = "AlumnosControllerImpl")
public class AlumnosControllerImpl implements IAlumnosController {
	

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	

	
	@RequestMapping(value = "/navigateToCreateFormAlumno")
	@Override
	public String navigateToCreateFormAlumno(Model model) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de alumnos, pasando un objeto Alumno");
		
		Alumno alumno = new Alumno();
		model.addAttribute("alumnoModel" ,alumno);
		
		List<Portatil> portatilesList = new ArrayList<>();
		try {
			portatilesList = portatilService.listarPortatiles();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de portatiles: " + e);
		}
		model.addAttribute("listaPortatiles" ,portatilesList);
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");

		return "createFormAlumno";
	}



	@RequestMapping(value = "/navigateToEditFormAlumno")
	@Override
	public ModelAndView navigateToEditFormAlumno(@RequestParam long alumno_id) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de edicion de alumnos, pasando un objeto Alumno");
		Alumno alumno = alumnoService.buscarAlumnoPorId(alumno_id);
		
		return new ModelAndView("editFormAlumno", "alumnoModel", alumno);
	}
	
/*	
	@RequestMapping(value = "/editAlumno")
	@Override
	public ModelAndView editAlumno(@RequestParam long alumno_id) throws Exception {
		logger.info("\nEntrando en el metodo --> editAlumno()");
		
		Alumno alumno = alumnoService.buscarAlumnoPorId(alumno_id);
		alumno.set_alumno_nombre("nuevo nombre");
		alumnoService.editarAlumno(alumno.getAlumno_id(), alumno.getAlumno_nombre(), alumno.getAlumno_apellidos(), alumno.getAlumno_telefono);
		
		List<Alumno> alumnosList = new ArrayList<>();
		try {
			alumnosList = alumnoService.listarALumnos();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de alumnos: " + e);
		}
		
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		return new ModelAndView("alumnos", "listaAlumnos", alumnosList);
	}
*/



	@RequestMapping(value = "/deleteAlumno")
	@Override
	public ModelAndView deleteAlumno(@RequestParam long alumno_id) throws Exception {
		logger.info("\nEntrando en el metodo --> deleteAlumno()");
		alumnoService.eliminarAlumnoPorid(alumno_id);
		
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