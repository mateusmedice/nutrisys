package br.com.cavy.studios.nutrisys.model;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6956133551550001770L;

	private Long idServiceProvider;
	
	private Address address;
	
	private List<Client> clients = new ArrayList<>();

	public ServiceProvider() {
		
	}
	
}
