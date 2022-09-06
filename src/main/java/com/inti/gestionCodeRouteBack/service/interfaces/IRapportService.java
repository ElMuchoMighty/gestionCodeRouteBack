package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Rapport;

public interface IRapportService {
	List<Rapport> findAll();

	Rapport findOne(Long idUtilisateur);

	Rapport save(Rapport rapport);

	void delete(Long idRapport);
}
