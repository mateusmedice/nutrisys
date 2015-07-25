package br.com.cavy.studios.nutrisys.dao;

import java.util.List;

import br.com.cavy.studios.nutrisys.model.Client;

public interface ClientDAO extends DAO<Client, Long> {

	List<Client> gettAll(Long id);
	
}
