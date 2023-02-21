package com.AlumnosPortatiles.project.web.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.app.repositories.implementations.AlumnoRepositoryImpl;
import com.AlumnosPortatiles.project.app.repositories.interfaces.IAlumnoRepository;
import com.AlumnosPortatiles.project.web.services.interfaces.IAlumnoService;


@Service(value = "AlumnoServiceImpl")
public class AlumnoServiceImpl implements IAlumnoService {

	
	@Autowired
	IAlumnoRepository alumnoRepository = new AlumnoRepositoryImpl();
	
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public List<Alumno> listarAlumnos() throws Exception {
		try {
			return alumnoRepository.listAlumnos();
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los alumnos (return null): " + e);
			return null;
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public Alumno buscarAlumnoPorId(long alumno_id) throws Exception {
		try {
			return alumnoRepository.findByIdAlumno(alumno_id);
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el alumno (return null): " + e);
			return null;
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void insertarAlumno(Alumno alumno) throws Exception {
		try {
			alumnoRepository.insertAlumno(alumno);
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al insertar el nuevo alumno: " + e);
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void editarAlumno(long alumno_id, String alumno_nombre, String alumno_apellidos, String alumno_telefono) throws Exception {
		try {
			alumnoRepository.editAlumno(alumno_id, alumno_nombre, alumno_apellidos, alumno_telefono);
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al editar el alumno seleccionado: " + e);
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void eliminarAlumnoPorid(long alumno_id) throws Exception {
		try {
			alumnoRepository.deleteByIdAlumno(alumno_id);
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al eliminar el alumno seleccionado: " + e);
		}
	}

}