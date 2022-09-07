package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.ReponseDAO;
import com.inti.gestionCodeRouteBack.entities.Reponse;
import com.inti.gestionCodeRouteBack.service.interfaces.IReponseService;

@Service
public class ReponseService implements IReponseService{
	@Autowired
	ReponseDAO reponseDAO;

	@Override
	public List<Reponse> findAll() {
		
		return reponseDAO.findAll();
	}

	@Override
	public Reponse save(Reponse reponse) {
		
		return reponseDAO.save(reponse);
	}

	@Override
	public void delete(Long id) {
		
		reponseDAO.deleteById(id);
	}

	@Override
	public Reponse findOne(Long idReponse) {
		return reponseDAO.findById(idReponse).get();
	}

}
