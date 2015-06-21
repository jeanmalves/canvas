package com.canvas.hibernate.core.coreCanvas.BO;

import com.canvas.hibernate.core.coreCanvas.DAO.CustomEntityManager;
import com.canvas.hibernate.core.coreCanvas.DAO.UsuarioDao;
import com.canvas.hibernate.core.coreCanvas.ENTITY.Usuario;

public class UsuarioBO {
	
	private CustomEntityManager customEntityManager; 
	
	public UsuarioBO(CustomEntityManager cEntityManager) {
		this.customEntityManager = cEntityManager;
	}

	public Usuario buscarEmail(String email){
		Usuario user = new Usuario();
		if(!email.equals("")){
			user.setEmail(email);
			UsuarioDao userDao = new UsuarioDao(customEntityManager.getEntityManager());
			return userDao.findByEmail(user);
		}
		
		return null;
	}
}
