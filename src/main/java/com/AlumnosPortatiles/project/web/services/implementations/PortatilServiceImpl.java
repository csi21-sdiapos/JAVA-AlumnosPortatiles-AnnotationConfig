package com.AlumnosPortatiles.project.web.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.app.repositories.implementations.PortatilRepositoryImpl;
import com.AlumnosPortatiles.project.app.repositories.interfaces.IPortatilRepository;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Service(value = "PortatilServiceImpl")
public class PortatilServiceImpl implements IPortatilService {

	
	@Autowired
	IPortatilRepository portatilRepository = new PortatilRepositoryImpl();
	
	
	
	@Override
	public List<Portatil> listarPortatiles() throws Exception {
		try {
			return portatilRepository.listPortatiles();
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los portatiles (return null): " + e);
			return null;
		}
	}
	
	

	@Override
	public Portatil buscarPortatilPorId(long portatil_id) throws Exception {
		try {
			return portatilRepository.findByIdPortatil(portatil_id);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el portatil (return null): " + e);
			return null;
		}
	}

	
	
	@Override
	public void insertarPortatil(Portatil portatil) throws Exception {
		try {
			portatilRepository.insertPortatil(portatil);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al insertar el nuevo portatil: " + e);
		}
	}

	
	
	@Override
	public void editarPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception {
		try {
			portatilRepository.editPortatil(portatil_id, portatil_marca, portatil_modelo);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al editar el portatil seleccionado: " + e);
		}
	}

	
	
	@Override
	public void eliminarPortatilPorId(long portatil_id) throws Exception {
		try {
			portatilRepository.deleteByIdPortatil(portatil_id);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al eliminar el portatil seleccionado: " + e);
		}
	}

}