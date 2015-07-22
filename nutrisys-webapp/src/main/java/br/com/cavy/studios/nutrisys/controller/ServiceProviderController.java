package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.cavy.studios.nutrisys.exception.ServiceException;
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
	
	@Autowired
	private LoggedUser loggedUser;

	@Get("/serviceProvider")
	public void serviceProvider() { 
		
	}
	
	@Post("/saveServiceProvider")
	public void save(ServiceProvider serviceProvider, String confirmacaoDeSenha) { 
		
		try {
			
			if (confirmacaoDeSenha != null && !confirmacaoDeSenha.equals(serviceProvider.getPassword())) {
				// MENSAGEM DE ERRO PARA SENHAS DIFERENTES
			}
			
			serviceProvider.setPassword(
					this.encryptionService.encrypt(serviceProvider.getPassword()));
		
			ServiceProvider savedServiceProvider = this.serviceProviderService.save(serviceProvider);
		
			loggedUser.login(savedServiceProvider);
			loggedUser.setClient(false);
			
			this.result.redirectTo(DashboardController.class).dashboard();
			
		} catch (ServiceException e) {
			// TODO: ADD MSG de EMAIL JA CADASTRADO
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
