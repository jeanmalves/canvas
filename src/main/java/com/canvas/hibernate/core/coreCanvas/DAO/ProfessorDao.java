package com.canvas.hibernate.core.coreCanvas.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.canvas.hibernate.core.coreCanvas.ENTITY.Professor;


public class ProfessorDao implements Dao<Professor, Integer>{

	private EntityManager entityManager;
	
	public ProfessorDao(EntityManager em ){
		
		this.entityManager = em;
	}
	
	public void save(Professor professor) {
		entityManager.persist(professor);
	}

	public void update(Professor professor) {
		entityManager.merge(professor);
	}

	public Professor findById(Integer id) {
		Professor professor = null;
		
		professor = entityManager.find(Professor.class, id);
		return professor;
	}

	public void delete(Professor professor) {
		// TODO Auto-generated method stub
		
	}

	public List<Professor> findAll() {
		
		 CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		 CriteriaQuery<Professor> c = cb.createQuery(Professor.class);
		 TypedQuery<Professor> professor = entityManager.createQuery(c);
		 
		return professor.getResultList();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
