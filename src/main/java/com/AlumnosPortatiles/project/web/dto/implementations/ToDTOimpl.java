package com.AlumnosPortatiles.project.web.dto.implementations;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.dto.interfaces.IToDTO;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;


public class ToDTOimpl implements IToDTO {

	
	@Override
	public AlumnoDTO toAlumnoDTO(String alumno_nombre, String alumno_apellidos, String alumno_telefono, Portatil portatil) {

		AlumnoDTO alumnoDTO = new AlumnoDTO(alumno_nombre, alumno_apellidos, alumno_telefono, portatil);
		return alumnoDTO;
	}

	
	@Override
	public PortatilDTO toPortatilDTO(String portatil_marca, String portatil_modelo) {

		PortatilDTO portatilDTO = new PortatilDTO(portatil_marca, portatil_modelo);
		return portatilDTO;
	}
	
}