package br.com.cavy.studios.nutrisys.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.cavy.studios.nutrisys.model.User;
import br.com.cavy.studios.nutrisys.service.UserService;

@Resource
public class LoginController {

	private final UserService userService;
	private final Validator validator;
	private final Result result;

	public LoginController(UserService userService, Validator validator, Result result) {
		this.userService = userService;
		this.validator = validator;
		this.result = result;
	}

	@Get("/login")
	public void login() { 
		
	}
	
	@Post("/login")
	public void logar(String login, String senha) {
		
		User user = this.userService.authenticate(login, senha);
		
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
