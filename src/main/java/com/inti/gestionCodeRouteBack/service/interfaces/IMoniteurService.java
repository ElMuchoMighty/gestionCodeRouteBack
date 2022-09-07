package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Moniteur;

public interface IMoniteurService {
	List<Moniteur> findAll();

	Moniteur findOne(Long idMoniteur);

	Moniteur save(Moniteur moniteur);

	void delete(Long idMoniteur);
}
