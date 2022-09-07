package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.RapportDAO;
import com.inti.gestionCodeRouteBack.entities.Rapport;
import com.inti.gestionCodeRouteBack.service.interfaces.IRapportService;
@Service
public class RapportService implements IRapportService{
	
	@Autowired
	RapportDAO rapportDAO;

	@Override
	public List<Rapport> findAll() {
		return rapportDAO.findAll();
	}

	@Override
	public Rapport findOne(Long idUtilisateur) {
		return rapportDAO.findById(idUtilisateur).get();
	}

	@Override
	public Rapport save(Rapport rapport) {
		return rapportDAO.save(rapport);
	}

	@Override
	public void delete(Long idRapport) {
		rapportDAO.deleteById(idRapport);
	}

}
