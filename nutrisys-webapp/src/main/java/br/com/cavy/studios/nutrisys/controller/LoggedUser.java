package br.com.cavy.studios.nutrisys.controller;

import java.io.Serializable;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.cavy.studios.nutrisys.model.User;

@Component
@SessionScoped
public class LoggedUser implements Serializable {
	
	private static final long serialVersionUID = -2720090221363468299L;
	
	private User user;

	private boolean isClient;
	
	public void login(User user) {
		this.user = user;
	}
	
	public boolean isLoggedIn() {
		return this.user != null;
	}
	
	public void logout() {
		this.user = null;
	}
	
	public User getUser() {
		return this.user;
	}

	public boolean isClient() {
		return isClient;
	}

	public void setClient(boolean isClient) {
		this.isClient = isClient;
	}
	
}
