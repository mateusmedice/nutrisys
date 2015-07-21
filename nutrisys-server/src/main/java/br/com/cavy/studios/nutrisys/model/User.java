package br.com.cavy.studios.nutrisys.model;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8217289629319714200L;

	private String fullName;
	
	private String nickname;
	
	private String email; 
	
	private String password;
	
	private String document;
	
	public User() {
		
	}
	
}
