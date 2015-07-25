package br.com.cavy.studios.nutrisys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cavy.studios.nutrisys.dao.ClientDAO;
import br.com.cavy.studios.nutrisys.model.Client;
import br.com.cavy.studios.nutrisys.service.ClientService;

@Service("clientService")
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDAO clientDAO;


	@Override
	public Client save(Client client) {
	
		if (client == null) {
			// evia o erro
		}
		
		return this.clientDAO.save(client);
	}
	
}
