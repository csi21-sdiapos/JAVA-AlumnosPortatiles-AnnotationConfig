package com.AlumnosPortatiles.project.web.dto.implementations;

import com.AlumnosPortatiles.project.app.entities.Alumno;
import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.dto.interfaces.IToDAO;
import com.AlumnosPortatiles.project.web.dto.models.AlumnoDTO;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;


public class ToDAOimpl implements IToDAO {


	@Override
	public Alumno alumnoDTOtoAlumnoDAO(AlumnoDTO alumnoDTO) {
		Alumno alumno = new Alumno();
		
		if (alumnoDTO != null) {
			alumno.setAlumno_nombre(alumnoDTO.getAlumno_nombre());
			alumno.setAlumno_apellidos(alumnoDTO.getAlumno_apellidos());
			alumno.setAlumno_telefono(alumnoDTO.getAlumno_telefono());
			alumno.setPortatil(alumnoDTO.getPortatil());
		}
		
		return alumno;
	}
	
	
	@Override
	public Portatil portatilDTOtoPortatilDAO(PortatilDTO portatilDTO) {
		Portatil portatil = new Portatil();
		
		if (portatilDTO != null) {
			portatil.setPortatil_marca(portatilDTO.getPortatil_marca());
			portatil.setPortatil_modelo(portatilDTO.getPortatil_modelo());
			portatil.setAlumno(portatilDTO.getAlumno());
		}
		
		return portatil;
	}
	
}