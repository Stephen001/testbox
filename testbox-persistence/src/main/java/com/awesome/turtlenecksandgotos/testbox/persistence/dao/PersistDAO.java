package com.awesome.turtlenecksandgotos.testbox.persistence.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.awesome.turtlenecksandgotos.testbox.persistence.BaseEntity;

@Stateless
public class PersistDAO implements PersistDAOLocal {
	@PersistenceContext(name="server")
	private EntityManager manager;
	
	@Override
	public <T> T byId(int id, Class<T> clazz) {
		return manager.find(clazz, id);
	}

	@Override
	public void persist(BaseEntity entity) {
		manager.persist(entity);
	}

	@Override
	public void remove(BaseEntity entity) {
		manager.remove(entity);
	}
}
