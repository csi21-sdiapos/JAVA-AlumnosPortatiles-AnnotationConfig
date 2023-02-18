package com.AlumnosPortatiles.project.web.dto.interfaces;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;


public interface IToDTO {

	
	/**
	 * To alumno DTO.
	 *
	 * @param alumno_nombre the alumno nombre
	 * @param alumno_apellidos the alumno apellidos
	 * @param alumno_telefono the alumno telefono
	 * @param portatil the portatil
	 * @return the alumno DTO
	 */
	public AlumnoDTO toAlumnoDTO(String alumno_nombre, String alumno_apellidos, String alumno_telefono, Portatil portatil);
	
	
	
	/**
	 * To portatil DTO.
	 *
	 * @param portatil_marca the portatil marca
	 * @param portatil_modelo the portatil modelo
	 * @return the portatil DTO
	 */
	public PortatilDTO toPortatilDTO(String portatil_marca, String portatil_modelo);
	
}