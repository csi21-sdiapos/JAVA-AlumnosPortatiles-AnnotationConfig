package com.AlumnosPortatiles.project.web.controllers.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.app.repositories.implementations.AlumnoRepositoryImpl;
import com.AlumnosPortatiles.project.repositories.interfaces.IAlumnoRepository;
import com.AlumnosPortatiles.project.web.controllers.interfaces.IAlumnosController;


@Controller(value = "AlumnosControllerImpl")
public class AlumnosControllerImpl implements IAlumnosController {
	

	protected final Log logger = LogFactory.getLog(getClass());
	
	IAlumnoRepository alumnoRepository = new AlumnoRepositoryImpl();
	

	
	@RequestMapping(value = "/alumnosListLoader")
	@Override
	public ModelAndView alumnosListLoader() throws Exception {
		logger.info("Entrando en el metodo --> alumnosListLoader()");
		List<Alumno> alumnosList = new ArrayList<>();
		
		try {
			alumnosList = alumnoRepository.listAlumnos();
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al cargar la lista de alumnos: " + e);
		}
		
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		return new ModelAndView("alumnos", "listaAlumnos", alumnosList);
	}

	
	
	@RequestMapping(value = "/navigateToCreateFormAlumno")
	@Override
	public String navigateToCreateFormAlumno(Model model) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de alumnos, pasando un objeto Alumno");
		
		Alumno alumnoModel = new Alumno();
        model.addAttribute("alumnoModel", alumnoModel);
        
		return "createFormAlumno";
	}

}