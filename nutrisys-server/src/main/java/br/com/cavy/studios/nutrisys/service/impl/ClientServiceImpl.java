package br.com.cavy.studios.nutrisys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cavy.studios.nutrisys.model.Client;
import br.com.cavy.studios.nutrisys.service.ClientService;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

	@Override
	public List<Client> getAll() {

		List<Client> clientList = new ArrayList<Client>();
		
		Client client = new Client();
		client.setIdClient(1L);
		client.setNickname("Nick de Teste");
		client.setFullName("Teste da Silva");
		client.setEmail("mateus.medice@gmail.com");

		clientList.add(client);
		clientList.add(client);
		
		return clientList;
	}
	
}
