package br.com.cavy.studios.nutrisys.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cavy.studios.nutrisys.dao.ParameterizationDAO;
import br.com.cavy.studios.nutrisys.model.Parameterization;

@Repository
public class ParameterizationDAOImpl extends DAOImpl<Parameterization, Long> implements ParameterizationDAO {

	@Override
	public Parameterization getParamBy(String key) {
		Criteria criteria = this.createCriteria(Parameterization.class);
		criteria.add(Restrictions.eq("key", key));
		return (Parameterization) criteria.uniqueResult();
	}

	
	
}
