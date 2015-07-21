package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3281062337878860483L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="clientId")
	private Long idClient;

	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;
	
	public Client() {
		
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
