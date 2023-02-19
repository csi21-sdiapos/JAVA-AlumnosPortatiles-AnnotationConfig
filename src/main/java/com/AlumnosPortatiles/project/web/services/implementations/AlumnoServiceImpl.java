package com.AlumnosPortatiles.project.web.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.AlumnosPortatiles.project.app.repositories.implementations.AlumnoRepositoryImpl;
import com.AlumnosPortatiles.project.repositories.interfaces.IAlumnoRepository;
import com.AlumnosPortatiles.project.web.dto.implementations.AlumnoToDAOimpl;
import com.AlumnosPortatiles.project.web.dto.implementations.AlumnoToDTOimpl;
import com.AlumnosPortatiles.project.web.dto.interfaces.IAlumnoToDAO;
import com.AlumnosPortatiles.project.web.dto.interfaces.IAlumnoToDTO;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;
import com.AlumnosPortatiles.project.web.services.interfaces.IAlumnoService;


@Service(value = "AlumnoServiceImpl")
public class AlumnoServiceImpl implements IAlumnoService {

	
	@Autowired
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@Autowired
	IAlumnoToDAO alumnoToDAO = new AlumnoToDAOimpl();
	
	@Autowired
	IAlumnoRepository alumnoRepository = new AlumnoRepositoryImpl();
	
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public List<AlumnoDTO> listarAlumnos() throws Exception {
		try {
			return alumnoToDTO.toListAlumnoDTO(alumnoRepository.listAlumnos());
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los alumnos (return null): " + e);
			return null;
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public AlumnoDTO buscarAlumnoPorId(long alumno_id) throws Exception {
		try {
			return alumnoToDTO.toAlumnoDTO(alumnoRepository.findByIdAlumno(alumno_id));
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el alumno (return null): " + e);
			return null;
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void insertarAlumno(AlumnoDTO alumnoDTO) throws Exception {
		try {
			alumnoRepository.insertAlumno(alumnoToDAO.toAlumnoDAO(alumnoDTO));
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