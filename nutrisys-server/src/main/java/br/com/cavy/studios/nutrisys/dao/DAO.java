package br.com.cavy.studios.nutrisys.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

@Repository
public interface DAO<T, PK extends Serializable> {

	T save(T t);
	
	void remove(T t);

	T getById(T t, PK pk);

	List<T> getAll(T t);
	
	EntityManager getEntityManager();
	
	Session getSession();
	
	Criteria createCriteria(T t);
}
