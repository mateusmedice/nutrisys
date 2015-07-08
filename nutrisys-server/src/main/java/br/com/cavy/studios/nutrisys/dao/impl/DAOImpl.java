package br.com.cavy.studios.nutrisys.dao.impl;

import java.io.Serializable;
import java.util.List;

import br.com.cavy.studios.nutrisys.dao.DAO;

public class DAOImpl<T, PK extends Serializable> implements DAO<T, PK> {

	@Override
	public T add(T t) {
		return null;
	}

	@Override
	public void remove(T t) {
		
	}

	@Override
	public T getById(T t, PK pk) {
		return null;
	}

	@Override
	public List<T> getAll(T t) {
		return null;
	}
	
}
