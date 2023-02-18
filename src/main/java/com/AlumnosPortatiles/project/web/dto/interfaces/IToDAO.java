package com.AlumnosPortatiles.project.web.dto.interfaces;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;


public interface IToDAO {

	
	/**
	 * Alumno DT oto alumno DAO.
	 *
	 * @param alumnoDTO the alumno DTO
	 * @return the alumno
	 */
	public Alumno alumnoDTOtoAlumnoDAO(AlumnoDTO alumnoDTO);
	
	
	
	/**
	 * Portatil DT oto portatil DAO.
	 *
	 * @param portatilDTO the portatil DTO
	 * @return the portatil
	 */
	public Portatil portatilDTOtoPortatilDAO(PortatilDTO portatilDTO);
	
}