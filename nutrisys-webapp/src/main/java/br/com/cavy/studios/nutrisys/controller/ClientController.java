package br.com.cavy.studios.nutrisys.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ClientController {

	@Autowired
	private Result result;
	
	public ClientController() {
		
	}
	
}
