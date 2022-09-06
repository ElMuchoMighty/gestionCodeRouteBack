package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.RendezVous;

public interface IRendezVousService {
	List<RendezVous> findAll();

	RendezVous findOne(Long idRendezVous);

	RendezVous save(RendezVous rendezVous);

	void delete(Long idRendezVous);
}
