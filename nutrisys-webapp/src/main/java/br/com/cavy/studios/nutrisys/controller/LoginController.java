package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.cavy.studios.nutrisys.model.Client;
import br.com.cavy.studios.nutrisys.model.ServiceProvider;
import br.com.cavy.studios.nutrisys.service.AddressService;
import br.com.cavy.studios.nutrisys.service.EncryptionService;
import br.com.cavy.studios.nutrisys.service.ServiceProviderService;

@Resource
public class LoginController {

	@Autowired
	private ServiceProviderService serviceProviderService;
	
	@Autowired
	private EncryptionService encryptionService;

	@Autowired
	private Validator validator;

	@Autowired
	private Result result;

	@Autowired
	private AddressService addressService;
	
	private final LoggedUser loggedUser;

	public LoginController(LoggedUser loggedUser) {
		this.loggedUser = loggedUser;
	}

	@Get("/login")
	public void login() { 
		
	}
	
	@Post("/login")
	public void logar(String login, String senha) {
		
		if ((login == null || login.isEmpty()) || (senha == null || senha.isEmpty())) {

			this.result.include("", "").redirectTo(this).login();
			// ADD ERROR MSG
		}
		
		ServiceProvider serviceProvider = 
			this.serviceProviderService.findBy(
				login, this.encryptionService.encrypt(senha));
		
		if (serviceProvider != null) {
			this.loggedUser.login(serviceProvider);
			this.loggedUser.setClient(false);

			this.result.redirectTo(DashboardController.class).dashboard();
			
		} else {
			// procura se e cliente
			
			this.loggedUser.login(new Client());
			this.loggedUser.setClient(false);
			
			// se nao for cliente direciona para a tela de new account
			this.result.redirectTo(this).createNew();
		}
	}
	
	@Get("/createNew")
	public void createNew() {
		this.result.redirectTo(ServiceProviderController.class).serviceProvider();
	}
	
	@Get("/logout")
	public void sair() {
		this.loggedUser.logout();
		this.result.redirectTo(this).login();
	}
	
}
