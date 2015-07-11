package br.com.cavy.studios.nutrisys.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class DashboardController {

	private final Result result;

	public DashboardController(Result result) {
		this.result = result;
	}
	
	@Get("/dashboard")
	public void dashboard() {
		
	}

}
