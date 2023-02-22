package com.AlumnosPortatiles.project.app.repositories.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.AlumnosPortatiles.project.app.entities.Alumno;


public interface IAlumnoRepository extends CrudRepository<Alumno, Long> {
	
}