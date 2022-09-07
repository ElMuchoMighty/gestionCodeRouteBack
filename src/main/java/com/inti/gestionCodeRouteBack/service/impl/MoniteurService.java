package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.MoniteurDAO;
import com.inti.gestionCodeRouteBack.entities.Moniteur;
import com.inti.gestionCodeRouteBack.service.interfaces.IMoniteurService;
@Service
public class MoniteurService implements IMoniteurService{
	
	@Autowired
	MoniteurDAO moniteurDAO;
 
	@Override
	public List<Moniteur> findAll() {
		return moniteurDAO.findAll();
	}

	@Override
	public Moniteur findOne(Long idMoniteur) {
		return moniteurDAO.findById(idMoniteur).get();
	}

	@Override
	public Moniteur save(Moniteur moniteur) {
		return moniteurDAO.save(moniteur);
	}

	@Override
	public void delete(Long idMoniteur) {
		moniteurDAO.deleteById(idMoniteur);
	}

}
