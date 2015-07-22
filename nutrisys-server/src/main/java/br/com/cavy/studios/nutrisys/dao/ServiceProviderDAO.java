package br.com.cavy.studios.nutrisys.dao;

import br.com.cavy.studios.nutrisys.model.ServiceProvider;

public interface ServiceProviderDAO extends DAO<ServiceProvider, Long> {

	ServiceProvider findBy(String email);
	
	ServiceProvider findBy(String email, String password);
	
}
