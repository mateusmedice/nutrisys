package br.com.cavy.studios.nutrisys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cavy.studios.nutrisys.model.Client;
import br.com.cavy.studios.nutrisys.model.ServiceProvider;
import br.com.cavy.studios.nutrisys.model.User;
import br.com.cavy.studios.nutrisys.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public List<String> getUsers() {

		List<String> list = new ArrayList<String>();

		list.add("Mateus");
		list.add("Josiel");
		list.add("Tamires");
		list.add("João");
		list.add("Teste");
		
		
		return list;
	}

	@Override
	public User authenticate(String login, String senha) {

		// FIXME: If Service Provider
		User serviceProvider = new ServiceProvider();
		
		// FIXME: If Client
		User client = new Client();
		
		// TODO: Find on database (DAO)
		// TODO: Verify if this user is ServiceProvider or Client
		
		return serviceProvider;
	}

}
