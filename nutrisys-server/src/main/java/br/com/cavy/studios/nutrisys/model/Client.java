package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

public class Client extends User implements Serializable {

	private Long idClient;
	
	private Address address;
	
	public Client() {
		
	}
	
}
