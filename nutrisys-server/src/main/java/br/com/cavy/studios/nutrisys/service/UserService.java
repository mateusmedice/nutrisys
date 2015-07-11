package br.com.cavy.studios.nutrisys.service;

import java.util.List;

import br.com.cavy.studios.nutrisys.model.User;

public interface UserService {

	List<String> getUsers();

	User authenticate(String login, String senha);
	
}
