package com.AlumnosPortatiles.project.web.services.interfaces;

import java.util.List;

import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;


public interface IAlumnoService {

	
	/**
	 * Listar alumnos.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<AlumnoDTO> listarAlumnos() throws Exception;
	
	
	
	/**
	 * Buscar alumno por id.
	 *
	 * @param alumno_id the alumno id
	 * @return the alumno DTO
	 * @throws Exception the exception
	 */
	public AlumnoDTO buscarAlumnoPorId(long alumno_id) throws Exception;
	
	
	
	/**
	 * Insertar alumno.
	 *
	 * @param alumnoDTO the alumno DTO
	 * @throws Exception the exception
	 */
	public void insertarAlumno(AlumnoDTO alumnoDTO) throws Exception;
	
	
	
	/**
	 * Editar alumno.
	 *
	 * @param alumno_id the alumno id
	 * @param alumno_nombre the alumno nombre
	 * @param alumno_apellidos the alumno apellidos
	 * @param alumno_telefono the alumno telefono
	 * @throws Exception the exception
	 */
	public void editarAlumno(long alumno_id, String alumno_nombre, String alumno_apellidos, String alumno_telefono) throws Exception;
	
	
	
	/**
	 * Eliminar alumno porid.
	 *
	 * @param alumno_id the alumno id
	 * @throws Exception the exception
	 */
	public void eliminarAlumnoPorid(long alumno_id) throws Exception;
	
}