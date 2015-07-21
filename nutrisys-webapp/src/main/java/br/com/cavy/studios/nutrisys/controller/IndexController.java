package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	@Autowired
	private Result result;

	public IndexController() {

	}
	
	@Get("/")
	public void index() {
		result.redirectTo(LoginController.class).login();
	}
}