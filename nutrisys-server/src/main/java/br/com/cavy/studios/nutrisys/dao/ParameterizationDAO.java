package br.com.cavy.studios.nutrisys.dao;

import br.com.cavy.studios.nutrisys.model.Parameterization;

public interface ParameterizationDAO extends DAO<Parameterization, Long> {

	Parameterization getParamBy(String key);
	
}
