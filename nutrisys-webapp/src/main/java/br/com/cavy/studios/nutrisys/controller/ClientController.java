package br.com.cavy.studios.nutrisys.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ClientController {

	private final Result result;
	
	public ClientController(Result result) {
		this.result = result;
	}
	
	
}
