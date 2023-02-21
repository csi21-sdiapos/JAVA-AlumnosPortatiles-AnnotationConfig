package com.AlumnosPortatiles.project.web.services.interfaces;

import java.util.List;

import com.AlumnosPortatiles.project.app.entities.Alumno;


public interface IAlumnoService {

	
	/**
	 * Listar alumnos.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Alumno> listarAlumnos() throws Exception;
	
	
	
	/**
	 * Buscar alumno por id.
	 *
	 * @param alumno_id the alumno id
	 * @return the alumno
	 * @throws Exception the exception
	 */
	public Alumno buscarAlumnoPorId(long alumno_id) throws Exception;
	
	
	
	/**
	 * Insertar alumno.
	 *
	 * @param alumno the alumno
	 * @throws Exception the exception
	 */
	public void insertarAlumno(Alumno alumno) throws Exception;
	
	
	
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