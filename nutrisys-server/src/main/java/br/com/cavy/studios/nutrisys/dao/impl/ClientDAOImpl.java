package br.com.cavy.studios.nutrisys.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cavy.studios.nutrisys.dao.ClientDAO;
import br.com.cavy.studios.nutrisys.model.Client;

@Repository("clientDAO")
public class ClientDAOImpl extends DAOImpl<Client, Long> implements ClientDAO {

	@Override
	public List<Client> gettAll(Long id) {
		Criteria criteria = this.createCriteria(Client.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

}
