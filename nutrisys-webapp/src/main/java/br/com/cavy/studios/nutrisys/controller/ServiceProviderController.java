package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.cavy.studios.nutrisys.model.ServiceProvider;
import br.com.cavy.studios.nutrisys.service.EncryptionService;
import br.com.cavy.studios.nutrisys.service.ServiceProviderService;

@Resource
public class ServiceProviderController {

	@Autowired
	private Result result;

	@Autowired
	private ServiceProviderService serviceProviderService;
	
	@Autowired
	private EncryptionService encryptionService;

	@Get("/serviceProvider")
	public void serviceProvider() { 
		
	}
	
	@Post("/save")
	public void save(ServiceProvider serviceProvider) { 
		
		serviceProvider.setPassword(
			this.encryptionService.encrypt(serviceProvider.getPassword()));
		
		this.serviceProviderService.save(serviceProvider);
	}
	
}
