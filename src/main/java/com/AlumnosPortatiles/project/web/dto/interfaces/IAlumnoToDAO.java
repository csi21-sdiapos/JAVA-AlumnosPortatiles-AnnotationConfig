package com.AlumnosPortatiles.project.web.dto.interfaces;

import java.util.List;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;


public interface IAlumnoToDAO {

	
	/**
	 * To alumno DAO.
	 *
	 * @param alumnoDTO the alumno DTO
	 * @return the alumno
	 * @throws Exception the exception
	 */
	public Alumno toAlumnoDAO(AlumnoDTO alumnoDTO) throws Exception;
	
	
	
	/**
	 * To list alumno DAO.
	 *
	 * @param listAlumnoDTO the list alumno DTO
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Alumno> toListAlumnoDAO(List<AlumnoDTO> listAlumnoDTO) throws Exception;
	
}