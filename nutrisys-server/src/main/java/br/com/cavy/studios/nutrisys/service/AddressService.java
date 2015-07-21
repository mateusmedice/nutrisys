package br.com.cavy.studios.nutrisys.service;

import br.com.cavy.studios.nutrisys.model.Address;

public interface AddressService {

	Address save(Address address);
	
	Address findAddressByZipCode(String zipCode);
	
}
