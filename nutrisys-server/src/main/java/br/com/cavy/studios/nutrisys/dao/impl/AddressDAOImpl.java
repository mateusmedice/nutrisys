package br.com.cavy.studios.nutrisys.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.cavy.studios.nutrisys.dao.AddressDAO;
import br.com.cavy.studios.nutrisys.model.Address;

@Repository("addressDAO")
public class AddressDAOImpl extends DAOImpl<Address, Long> implements AddressDAO {

}
