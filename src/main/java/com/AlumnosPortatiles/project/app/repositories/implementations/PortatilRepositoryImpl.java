package com.AlumnosPortatiles.project.app.repositories.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.AlumnosPortatiles.project.app.entities.Portatil;
import com.AlumnosPortatiles.project.repositories.interfaces.IPortatilRepository;


@Repository(value = "PortatilRepositoryImpl")
public class PortatilRepositoryImpl implements IPortatilRepository {

	
	@PersistenceContext(synchronization = SynchronizationType.SYNCHRONIZED, type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

	
	
	@Override
	public List<Portatil> listPortatiles() throws Exception {
		// the lowercase p refers to the object
		// :objectID is a parameterized query thats value is set below
		String query = "SELECT p FROM Portatil p WHERE p.id IS NOT NULL";
				    	
		// Issue the query and get a matching object
		TypedQuery<Portatil> typedQuery = entityManager.createQuery(query, Portatil.class);
		List<Portatil> listaPortatiles = new ArrayList<>();
				    	
		try {
			// Get matching objects and output
			listaPortatiles = typedQuery.getResultList();
		}
				    	
		catch(NoResultException ex) {
			ex.printStackTrace();
		}
				    	
		finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
				    	
		return listaPortatiles;
	}
	
	

	@Override
	public Portatil findByIdPortatil(long portatil_id) throws Exception {
		// the lowercase p refers to the object
		// :objectID is a parameterized query thats value is set below
		String query = "SELECT p FROM Portatil p WHERE p.id = :portatilID";
				    	
		// Issue the query and get a matching object
		TypedQuery<Portatil> typedQuery = entityManager.createQuery(query, Portatil.class);
		typedQuery.setParameter("portatilID", portatil_id);

		Portatil portatil = new Portatil();
				    	
		try {
			// Get matching the object and output
			portatil = typedQuery.getSingleResult();	
		}
				    	
		catch(NoResultException e) {
			e.printStackTrace();
		}
				    	
		finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
				    	
		return portatil;
	}
	
	

	@Override
	public void insertPortatil(Portatil portatil) throws Exception {
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
						 
		try {
			// Get transaction and start
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
				 
			// Save the object
			entityManager.merge(portatil);
			entityTransaction.commit();
				            
		} catch (Exception ex) {
			// If there is an exception rollback changes
			if (entityTransaction != null) {
			entityTransaction.rollback();
			}
				            
			ex.printStackTrace();
				        
		} finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
	}
	
	
	
	@Override
	public void editPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception {
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
				
		// the lowercase a refers to the object
    	// :objectID is a parameterized query thats value is set below
		String jpql = "UPDATE Portatil p SET p.portatil_marca = :portatilMARCA, p.portatil_modelo = :portatilMODELO WHERE p.id = :portatilID";
    	
		// Issue the query and get a matching object
    	Query query = entityManager.createQuery(jpql);
    	query.setParameter("portatilID", portatil_id);
    	query.setParameter("portatilMARCA", portatil_marca);
    	query.setParameter("portatilMODELO", portatil_modelo);
    	
    	int nRegistrosEditados = 0;
    	
    	try {
    		// Get transaction and start
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
    		// Get matching the object and output
    		nRegistrosEditados = query.executeUpdate();
    		entityTransaction.commit();
    		System.out.println("\n\n[INFO] -Numero de portatiles editados: " + nRegistrosEditados);
		
    	} catch (Exception ex) {
    		// If there is an exception rollback changes
		    if (entityTransaction != null) {
		    	entityTransaction.rollback();
		    }
		    
			ex.printStackTrace();
		
    	} finally {
    		// Close EntityManager
    		// entityManager.flush();
    		// entityManager.clear();
    		entityManager.close();
		}
	}
	
	

/*
	@Override
	public void editPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception {
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
						
		Portatil portatil = new Portatil();
						
		try {
			// Get transaction and start
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
				 
			// Find object and make changes
			portatil = entityManager.find(Portatil.class, portatil_id);
			portatil.setPortatil_marca(portatil_marca);
			portatil.setPortatil_modelo(portatil_modelo);
			
			// Save the object
			entityManager.merge(portatil);
			entityTransaction.commit();
				            
		} catch (Exception ex) {
			// If there is an exception rollback changes
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
				            
			ex.printStackTrace();
				        
		} finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
	}
*/
	
	
	
	@Override
	public void deleteByIdPortatil(long portatil_id) throws Exception {
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
				
		// the lowercase p refers to the object
		// :objectID is a parameterized query thats value is set below
		String jpql = "DELETE FROM Portatil p WHERE p.id = :portatilID";
		    	
		// Issue the query and get a matching object
		Query query = entityManager.createQuery(jpql);
		query.setParameter("portatilID", portatil_id);
		    	
		int nRegistrosEliminados = 0;
		    	
		try {
			// Get transaction and start
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
			// Get matching the object and output
		    nRegistrosEliminados = query.executeUpdate();
		    entityTransaction.commit();
		    System.out.println("\n\n[INFO] -Numero de portatiles eliminados: " + nRegistrosEliminados);
				
		} catch (Exception ex) {
			// If there is an exception rollback changes
		    if (entityTransaction != null) {
		    	entityTransaction.rollback();
		    }
		    
			ex.printStackTrace();
				
		} finally {
			// Close EntityManager
		    // entityManager.flush();
		    // entityManager.clear();
		    entityManager.close();
		}
	}
	

/*
	@Override
	public void deleteByIdPortatil(long portatil_id) throws Exception {
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
								
		Portatil portatil = new Portatil();
				 
		try {
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
				            
			portatil = entityManager.find(Portatil.class, portatil_id);
			entityManager.remove(entityManager.contains(portatil) ? portatil : entityManager.merge(portatil));
				    
			entityTransaction.commit();
				        
		} catch (Exception ex) {
			// If there is an exception rollback changes
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
				            
			ex.printStackTrace();
				        
		} finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
	}
*/
	
	
	
	@Override
	public void deletePortatil(Portatil portatil) throws Exception {
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
		 
		try {
			entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
			entityManager.remove(entityManager.contains(portatil) ? portatil : entityManager.merge(portatil));
		    
		    entityTransaction.commit();
		    
		} catch (Exception ex) {
		    // If there is an exception rollback changes
			if (entityTransaction != null) {
				entityTransaction.rollback();
		    }
		            
		    ex.printStackTrace();
		        
		} finally {
			// Close EntityManager
		    // entityManager.flush();
		    // entityManager.clear();
		    entityManager.close();
		}
	}
	
}