package br.com.cavy.studios.nutrisys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.cavy.studios.nutrisys.model.Client;
import br.com.cavy.studios.nutrisys.service.ClientService;

@Resource
public class DashboardController {

	@Autowired
	private Result result;
	
	@Autowired
	private ClientService clientService;
	
	public DashboardController() {

	}
	
	@Get("/dashboard")
	public void dashboard() {
		
		List<Client> clientList = clientService.getAll();
				
		this.result.include("clientList", clientList);
	}

}
