package br.com.cavy.studios.nutrisys.service;

public interface EncryptionService {

	String encrypt(String password);
	
	String decrypt(String password);
	
}
