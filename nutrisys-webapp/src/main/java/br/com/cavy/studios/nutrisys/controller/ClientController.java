package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.cavy.studios.nutrisys.model.ServiceProvider;
import br.com.cavy.studios.nutrisys.service.ClientService;

@Resource
public class ClientController {

	@Autowired
	private Result result;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private LoggedUser loggedUser;
	
	public ClientController() {
		
	}
	
	@Get("list")
	public void listAll() {
		
		if (this.loggedUser == null) {
			this.loggedUser.logout();
			this.result.redirectTo(IndexController.class).index();
			return;
		}
		
		if (!this.loggedUser.isClient()) {
			this.result.include("clientList", ((ServiceProvider) this.loggedUser.getUser()).getClients());
			return;
		}
	}
	
}
