package com.AlumnosPortatiles.project.web.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.AlumnosPortatiles.project.app.repositories.implementations.PortatilRepositoryImpl;
import com.AlumnosPortatiles.project.repositories.interfaces.IPortatilRepository;
import com.AlumnosPortatiles.project.web.dto.implementations.PortatilToDAOimpl;
import com.AlumnosPortatiles.project.web.dto.implementations.PortatilToDTOimpl;
import com.AlumnosPortatiles.project.web.dto.interfaces.IPortatilToDAO;
import com.AlumnosPortatiles.project.web.dto.interfaces.IPortatilToDTO;
import com.AlumnosPortatiles.project.web.dto.models.PortatilDTO;
import com.AlumnosPortatiles.project.web.services.interfaces.IPortatilService;


@Service(value = "PortatilServiceImpl")
public class PortatilServiceImpl implements IPortatilService {

	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();
	
	@Autowired
	IPortatilToDAO portatilToDAO = new PortatilToDAOimpl();
	
	@Autowired
	IPortatilRepository portatilRepository = new PortatilRepositoryImpl();
	
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public List<PortatilDTO> listarPortatiles() throws Exception {
		try {
			return portatilToDTO.toListPortatilDTO(portatilRepository.listPortatiles());
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los portatiles (return null): " + e);
			return null;
		}
	}
	
	

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public PortatilDTO buscarPortatilPorId(long portatil_id) throws Exception {
		try {
			return portatilToDTO.toPortatilDTO(portatilRepository.findByIdPortatil(portatil_id));
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el portatil (return null): " + e);
			return null;
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void insertarPortatil(PortatilDTO portatilDTO) throws Exception {
		try {
			portatilRepository.insertPortatil(portatilToDAO.toPortatilDAO(portatilDTO));
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al insertar el nuevo portatil: " + e);
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void editarPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception {
		try {
			portatilRepository.editPortatil(portatil_id, portatil_marca, portatil_modelo);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al editar el portatil seleccionado: " + e);
		}
	}

	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void eliminarPortatilPorId(long portatil_id) throws Exception {
		try {
			portatilRepository.deleteByIdPortatil(portatil_id);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al eliminar el portatil seleccionado: " + e);
		}
	}

}