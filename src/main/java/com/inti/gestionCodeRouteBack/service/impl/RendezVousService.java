package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.RendezVousDAO;
import com.inti.gestionCodeRouteBack.entities.RendezVous;
import com.inti.gestionCodeRouteBack.service.interfaces.IRendezVousService;
@Service
public class RendezVousService implements IRendezVousService{

	
	@Autowired
	RendezVousDAO rendezVousDAO;
	
	@Override
	public List<RendezVous> findAll() {
		return rendezVousDAO.findAll();
	}

	@Override
	public RendezVous findOne(Long idRendezVous) {
		return rendezVousDAO.findById(idRendezVous).get();
	}

	@Override
	public RendezVous save(RendezVous rendezVous) {
		return rendezVousDAO.save(rendezVous);
	}

	@Override
	public void delete(Long idRendezVous) {
		rendezVousDAO.deleteById(idRendezVous);
	}

}
