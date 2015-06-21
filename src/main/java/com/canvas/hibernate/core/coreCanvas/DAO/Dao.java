package com.canvas.hibernate.core.coreCanvas.DAO;

import java.util.List;

public interface Dao<T, I> {
	
	public void save(T entity);
	
	public void update(T entity);
	
	public T findById(I id);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();
}
