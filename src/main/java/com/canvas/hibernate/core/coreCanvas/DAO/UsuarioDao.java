package com.canvas.hibernate.core.coreCanvas.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import com.canvas.hibernate.core.coreCanvas.ENTITY.Usuario;

public class UsuarioDao implements Dao<Usuario, Integer>{
	
	private EntityManager entityManager;
	
	public UsuarioDao(EntityManager em) {
		this.entityManager = em;
	}

	public void save(Usuario entity) {
		
		this.entityManager.persist(entity);
		
	}

	public void update(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	public Usuario findById(Integer id) {
		Usuario usuario = null;
		
		usuario = entityManager.find(Usuario.class, id);
		return usuario;
	}
	
	public Usuario findByEmail(Usuario usuario) {
		
		usuario = entityManager.find(Usuario.class, usuario.getEmail());
		return usuario;
	}

	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


}
