package com.awesome.turtlenecksandgotos.testbox.persistence.dao;

import javax.ejb.Local;

import com.awesome.turtlenecksandgotos.testbox.persistence.BaseEntity;

@Local
public interface PersistDAOLocal {
	public <T> T byId(int id, Class<T> clazz);
	
	public void persist(BaseEntity entity);
	
	public void remove(BaseEntity entity);
}
