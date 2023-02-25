package com.AlumnosPortatiles.project.web.restControllers.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.AlumnosPortatiles.project.app.entities.Portatil;


public interface IPortatilRestController {

	
	/**
	 * Find portatil by id.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	public ResponseEntity<Portatil> findPortatilById(@PathVariable("id") long id);
	
}