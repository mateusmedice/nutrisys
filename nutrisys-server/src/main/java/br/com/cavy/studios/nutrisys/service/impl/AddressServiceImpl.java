package br.com.cavy.studios.nutrisys.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cavy.studios.nutrisys.dao.AddressDAO;
import br.com.cavy.studios.nutrisys.model.Address;
import br.com.cavy.studios.nutrisys.model.AddressServiceModel;
import br.com.cavy.studios.nutrisys.service.AddressService;

import com.google.gson.Gson;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDAO addressDAO;

	@Override
	public Address save(Address address) {

		return this.addressDAO.save(address);
	}

	@Override
	public Address findAddressByZipCode(String zipCode) {

		if (zipCode == null || zipCode.isEmpty()) {
			throw new IllegalArgumentException(
					"The param Zip Code cant be null.");
		}

		try {

			String httpUrl = "http://api.postmon.com.br/v1/cep/${zipcode}";

			httpUrl = httpUrl.replace("${zipcode}", zipCode);

			URL url = new URL(httpUrl);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			BufferedReader reader = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output = "";
			String value = "";
			while ((output = reader.readLine()) != null) {
				value += output;
			}

			Gson gson = new Gson();
			
			AddressServiceModel addressServiceModel = gson.fromJson(value, AddressServiceModel.class);
			
			Address address = new Address(null, addressServiceModel.getBairro(), 
					addressServiceModel.getCidade(), addressServiceModel.getCep(), 
					addressServiceModel.getLogradouro(), addressServiceModel.getEstado(), 
					addressServiceModel.getEstado_info().getNome(), null, null);
					
			conn.disconnect();

			return address;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
