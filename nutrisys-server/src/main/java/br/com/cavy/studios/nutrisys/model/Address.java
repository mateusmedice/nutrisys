package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

public class Address implements Serializable {

	private Long idAddress;
	
	private String street;
	
	private String neighborhood;
	
	private String number;
	
	private String complement;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zipCode;
	
	public Address() {
		
	}
	
}
