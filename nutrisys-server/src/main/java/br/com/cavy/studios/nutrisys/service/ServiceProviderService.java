package br.com.cavy.studios.nutrisys.service;

import br.com.cavy.studios.nutrisys.model.ServiceProvider;

public interface ServiceProviderService {

	ServiceProvider save(ServiceProvider serviceProvider);

	ServiceProvider findBy(String login, String password);
	
}
