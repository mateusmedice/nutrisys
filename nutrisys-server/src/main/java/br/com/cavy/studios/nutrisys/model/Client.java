package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

import javax.persistence.Entity;
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

	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;
	
	public Client() {
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
