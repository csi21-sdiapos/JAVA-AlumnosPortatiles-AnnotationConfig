package com.AlumnosPortatiles.project.web.dto.interfaces;

import java.util.List;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;


public interface IAlumnoToDTO {

	
	/**
	 * To alumno DTO.
	 *
	 * @param AlumnoDAO the alumno DAO
	 * @return the alumno DTO
	 * @throws Exception the exception
	 */
	public AlumnoDTO toAlumnoDTO(Alumno AlumnoDAO) throws Exception;
	
	
	
	/**
	 * To list alumno DTO.
	 *
	 * @param listAlumnoDAO the list alumno DAO
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<AlumnoDTO> toListAlumnoDTO(List<Alumno> listAlumnoDAO) throws Exception;
	
}