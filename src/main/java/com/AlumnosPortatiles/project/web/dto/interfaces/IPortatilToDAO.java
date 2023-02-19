package com.AlumnosPortatiles.project.web.dto.interfaces;

import java.util.List;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;


public interface IPortatilToDAO {

	
	/**
	 * To portatil DAO.
	 *
	 * @param portatilDTO the portatil DTO
	 * @return the portatil
	 * @throws Exception the exception
	 */
	public Portatil toPortatilDAO(PortatilDTO portatilDTO) throws Exception;
	
	
	
	/**
	 * To list portatil DAO.
	 *
	 * @param listPortatilDTO the list portatil DTO
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Portatil> toListPortatilDAO(List<PortatilDTO> listPortatilDTO) throws Exception;
	
}