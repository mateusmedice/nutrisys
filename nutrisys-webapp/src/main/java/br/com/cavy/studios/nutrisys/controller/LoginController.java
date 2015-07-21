package br.com.cavy.studios.nutrisys.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.cavy.studios.nutrisys.model.Address;
import br.com.cavy.studios.nutrisys.model.User;
import br.com.cavy.studios.nutrisys.service.AddressService;
import br.com.cavy.studios.nutrisys.service.UserService;

@Resource
public class LoginController {

	private final UserService userService;
	private final Validator validator;
	private final Result result;
	private final AddressService addressService;

	public LoginController(AddressService addressService, UserService userService, Validator validator, Result result) {
		this.userService = userService;
		this.validator = validator;
		this.result = result;
		this.addressService = addressService;
	}

	@Get("/login")
	public void login() { 
		
	}
	
	@Post("/login")
	public void logar(String login, String senha) {
		
		User user = this.userService.authenticate(login, senha);
		
		Address address = this.addressService.findAddressByZipCode("05001000");

		address.setNumber("44");
		address.setComplement("Apto 111");
		
		Address addedAddress = this.addressService.save(address);
		
		System.out.println(addedAddress.getCity());
		
		/*
		Usuario usuario = autenticador.autentica(login, senha);
		if (usuario == null) {
			validator.add(new ValidationMessage("Login e/ou senha inválidos", "Login"));
			validator.onErrorForwardTo(this).login();
		}
		
		usuarioWeb.loga(usuario);
		*/
		
		result.redirectTo(DashboardController.class).dashboard();
	}
	
	@Get("/logout")
	public void sair() {
		// usuarioWeb.logout();
		result.redirectTo(this).login();
	}
	
}
