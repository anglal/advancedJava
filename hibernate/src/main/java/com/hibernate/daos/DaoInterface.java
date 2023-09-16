package com.hibernate.daos;

import java.util.List;

public interface DaoInterface<T> {
	public List<T> findAll();
	public T findById(int id);
	public void update(T entity);
	public T save(T entity);
	public void delete(int id);
	
}
