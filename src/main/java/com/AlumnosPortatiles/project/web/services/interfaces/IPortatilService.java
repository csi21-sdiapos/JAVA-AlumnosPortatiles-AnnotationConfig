package com.AlumnosPortatiles.project.web.services.interfaces;

import java.util.List;

import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;


public interface IPortatilService {

	
	/**
	 * Listar portatiles.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<PortatilDTO> listarPortatiles() throws Exception;
	
	
	
	/**
	 * Buscar portatil por id.
	 *
	 * @param portatil_id the portatil id
	 * @return the portatil DTO
	 * @throws Exception the exception
	 */
	public PortatilDTO buscarPortatilPorId(long portatil_id) throws Exception;
	
	
	
	/**
	 * Insertar portatil.
	 *
	 * @param portatilDTO the portatil DTO
	 * @throws Exception the exception
	 */
	public void insertarPortatil(PortatilDTO portatilDTO) throws Exception;
	
	
	
	/**
	 * Editar portatil.
	 *
	 * @param portatil_id the portatil id
	 * @param portatil_marca the portatil marca
	 * @param portatil_modelo the portatil modelo
	 * @throws Exception the exception
	 */
	public void editarPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception;
	
	
	
	/**
	 * Eliminar portatil por id.
	 *
	 * @param portatil_id the portatil id
	 * @throws Exception the exception
	 */
	public void eliminarPortatilPorId(long portatil_id) throws Exception;
	
}