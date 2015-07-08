package br.com.cavy.studios.nutrisys.dao;

import java.io.Serializable;
import java.util.List;

public interface DAO<T, PK extends Serializable> {

	T add(T t);
	
	void remove(T t);

	T getById(T t, PK pk);

	List<T> getAll(T t);
}
