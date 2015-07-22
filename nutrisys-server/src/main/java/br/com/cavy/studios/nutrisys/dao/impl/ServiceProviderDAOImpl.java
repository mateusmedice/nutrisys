package br.com.cavy.studios.nutrisys.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cavy.studios.nutrisys.dao.ServiceProviderDAO;
import br.com.cavy.studios.nutrisys.model.ServiceProvider;

@Repository("serviceProviderDAO")
public class ServiceProviderDAOImpl extends DAOImpl<ServiceProvider, Long> implements ServiceProviderDAO {

	@Override
	public ServiceProvider findBy(String email, String password) {
		
		Criteria criteria = createCriteria(ServiceProvider.class);

		criteria.add(Restrictions.eq("email", email));
		
		criteria.add(Restrictions.eq("password", password));
		
		return (ServiceProvider) criteria.uniqueResult();
	}

}
