package br.com.cavy.studios.nutrisys.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.springframework.transaction.annotation.Transactional;

import br.com.cavy.studios.nutrisys.dao.DAO;

public class DAOImpl<T, PK extends Serializable> implements DAO<T, PK> {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public T save(T t) {
		
		if (t == null) {
			throw new IllegalArgumentException("Param T cant be null.");
		}
		
		return this.entityManager.merge(t);
	}

	@Override
	@Transactional
	public void remove(T t) {
		
		if (t == null) {
			throw new IllegalArgumentException("Param T cant be null.");
		}
		
		this.entityManager.remove(t);
	}

	@Override
	public T getById(T t, PK pk) {
		
		if (t == null) {
			throw new IllegalArgumentException("Param T cant be null.");
		}
		
		if (pk == null) {
			throw new IllegalArgumentException("Param PK cant be null.");
		}
		
		return this.entityManager.find((Class<T>) t, pk);
	}

	@Override
	public List<T> getAll(T t) {
		
		if (t == null) {
			throw new IllegalArgumentException("Param T cant be null.");
		}
		
		Criteria criteria = this.createCriteria((Class) t);
		
		return criteria.list();
	}

	@Override
	public EntityManager getEntityManager() {
		return this.entityManager;
	}
	
	public Session getSession() {
		
		Session session = (Session) this.entityManager.getDelegate();
		
		return session.getSessionFactory().openSession();
	}

	@Override
	public Criteria createCriteria(Class clazz) {

		return this.getSession().createCriteria(clazz);
	}
	
}
