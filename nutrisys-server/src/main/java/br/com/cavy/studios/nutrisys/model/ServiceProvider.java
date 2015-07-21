package br.com.cavy.studios.nutrisys.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_provider")
public class ServiceProvider extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6956133551550001770L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serviceProviderId")
	private Long idServiceProvider;
	
	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;
	
	private List<Client> clients = new ArrayList<>();

	public ServiceProvider() {
		
	}

	public Long getIdServiceProvider() {
		return idServiceProvider;
	}

	public void setIdServiceProvider(Long idServiceProvider) {
		this.idServiceProvider = idServiceProvider;
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
