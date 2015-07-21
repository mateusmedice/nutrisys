package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

public class Client extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3281062337878860483L;

	private Long idClient;
	
	private Address address;
	
	public Client() {
		
	}
	
}
