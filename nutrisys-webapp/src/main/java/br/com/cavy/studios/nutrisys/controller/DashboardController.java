package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.cavy.studios.nutrisys.model.ServiceProvider;
import br.com.cavy.studios.nutrisys.service.ClientService;

@Resource
public class DashboardController {

	@Autowired
	private Result result;
	
	@Autowired
	private ClientService clientService;
	
	private final LoggedUser loggedUser;
	
	public DashboardController(LoggedUser loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	@Get("/dashboard")
	public void dashboard() {
		
		if (!loggedUser.isClient()) {
			
			ServiceProvider serviceProvider = (ServiceProvider) loggedUser.getUser();
			
			this.result.include("clientList", serviceProvider.getClients());	
		}
		
				
		
	}

}
