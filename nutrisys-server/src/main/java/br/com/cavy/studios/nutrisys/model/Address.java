package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8440349928605577343L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAddress;

	@Column(name="neighborhood")
	private String neighborhood;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zipCode")
	private String zipCode;
	
	@Column(name="street")
	private String street;

	@Column(name="state")
	private String state;

	@Column(name="stateName")
	private String stateName;
	
	@Column(name="number")
	private String number;
	
	@Column(name="complement")
	private String complement;
	
	public Address() {
		
	}

	public Address(Long idAddress, String neighborhood, String city,
			String zipCode, String street, String state, String stateName,
			String number, String complement) {
		this.idAddress = idAddress;
		this.neighborhood = neighborhood;
		this.city = city;
		this.zipCode = zipCode;
		this.street = street;
		this.state = state;
		this.stateName = stateName;
		this.number = number;
		this.complement = complement;
	}

	public Long getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(Long idAddress) {
		this.idAddress = idAddress;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}
	
}
