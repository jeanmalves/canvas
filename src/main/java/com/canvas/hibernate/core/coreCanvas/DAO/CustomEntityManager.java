package com.canvas.hibernate.core.coreCanvas.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomEntityManager {
	
	private EntityManager entityManager;
    private EntityManagerFactory factory;
     
    public CustomEntityManager(EntityManagerFactory factory) {
    	
    	if(entityManager == null){
    		this.factory = factory;
    		this.entityManager = factory.createEntityManager();
    	}
    }
     
    public CustomEntityManager(String persistenceUnitName){
    	
    	if(entityManager == null){
	        factory = Persistence.createEntityManagerFactory(persistenceUnitName);
	        this.entityManager = factory.createEntityManager();
    	}
    }
 
    public void beginTransaction(){
        entityManager.getTransaction().begin();
    }
     
    public void commit(){
        entityManager.getTransaction().commit();
    }
     
    public void close(){
        entityManager.close();
        factory.close();
    }
     
    public void rollBack(){
        entityManager.getTransaction().rollback();
    }
     
    public EntityManager getEntityManager(){
        return entityManager;
    }

}
