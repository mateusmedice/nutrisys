package br.com.cavy.studios.nutrisys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cavy.studios.nutrisys.dao.ServiceProviderDAO;
import br.com.cavy.studios.nutrisys.model.ServiceProvider;
import br.com.cavy.studios.nutrisys.service.ServiceProviderService;

@Service("serviceProviderService")
public class ServiceProviderServiceImpl implements ServiceProviderService {

	@Autowired
	private ServiceProviderDAO serviceProviderDAO;
	
	@Override
	public ServiceProvider save(ServiceProvider serviceProvider) {

		if (serviceProvider == null) {
			throw new IllegalArgumentException("Service Provider can't be null.");
		}
		
		return this.serviceProviderDAO.save(serviceProvider);
	}

	@Override
	public ServiceProvider findBy(String login, String password) {	

		if (login == null || login.isEmpty()) {
			throw new IllegalArgumentException("Login can't be null.");
		}
		
		if (password == null || password.isEmpty()) {
			throw new IllegalArgumentException("Password can't be null.");
		}
		
		return this.serviceProviderDAO.findBy(login, password);
	}

}
