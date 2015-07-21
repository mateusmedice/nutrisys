package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.cavy.studios.nutrisys.service.AddressService;
import br.com.cavy.studios.nutrisys.service.UserService;

@Resource
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private Validator validator;

	@Autowired
	private Result result;

	@Autowired
	private AddressService addressService;

	public LoginController() {
		
	}

	@Get("/login")
	public void login() { 
		
	}
	
	@Post("/login")
	public void logar(String login, String senha) {
		
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
