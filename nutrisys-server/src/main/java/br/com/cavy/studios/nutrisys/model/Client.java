package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

import javax.persistence.Column;
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

	@Column(name="weight")
	private Integer weight;

	@Column(name="size")
	private Integer size;

	public Client() {
		
	}
	
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
