package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Cours;

public interface ICoursService {
	List<Cours> findAll();

	Cours findOne(Long idCours);

	Cours save(Cours cours);

	void delete(Long idCours);
}
