package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Favoris;

public interface IFavorisService {
	List<Favoris> findAll();

	Favoris findOne(Long idFavoris);

	Favoris save(Favoris favoris);

	void delete(Long idFavoris);
}
