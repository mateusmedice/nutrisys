package br.com.cavy.studios.nutrisys.service.impl;

import java.security.MessageDigest;

import org.springframework.stereotype.Service;

import br.com.cavy.studios.nutrisys.service.EncryptionService;

@Service("encryptionService")
public class EncryptionServiceImpl implements EncryptionService {

	private MessageDigest messageDigest;

	public EncryptionServiceImpl() {

		try {

			this.messageDigest = MessageDigest.getInstance("MD5");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String encrypt(String password) {

		this.messageDigest.reset();
		this.messageDigest.update(password.getBytes());
		
		byte[] digested = messageDigest.digest();
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < digested.length; i++) {
			sb.append(Integer.toHexString(0xff & digested[i]));
		}
		
		return sb.toString();
	}

	@Override
	public String decrypt(String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
