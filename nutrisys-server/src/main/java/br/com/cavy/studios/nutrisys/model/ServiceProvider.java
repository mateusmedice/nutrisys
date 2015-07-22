package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_provider")
public class ServiceProvider extends User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6956133551550001770L;
	
	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;
	
	@OneToMany
	@JoinColumn(name="clientId")
	private List<Client> clients = new ArrayList<>();

	public ServiceProvider() {
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
}
