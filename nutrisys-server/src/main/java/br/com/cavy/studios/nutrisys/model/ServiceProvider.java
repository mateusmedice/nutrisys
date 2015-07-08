package br.com.cavy.studios.nutrisys.model;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider extends User {
	
	private Long idServiceProvider;
	
	private Address address;
	
	private List<Client> clients = new ArrayList<>();

	public ServiceProvider() {
		
	}
	
}
