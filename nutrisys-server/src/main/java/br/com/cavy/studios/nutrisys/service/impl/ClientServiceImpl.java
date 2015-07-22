package br.com.cavy.studios.nutrisys.service.impl;

import java.util.ArrayList;
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
	public List<Client> getAll(Long idUser) {

		List<Client> clientList = new ArrayList<Client>();
		
		Client client = new Client();
		client.setNickname("Nick de Teste");
		client.setFullName("Teste da Silva");
		client.setEmail("mateus.medice@gmail.com");

		clientList.add(client);
		clientList.add(client);
		
		return clientList;
	}
	
}
