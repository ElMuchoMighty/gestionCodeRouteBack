package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.FavorisDAO;
import com.inti.gestionCodeRouteBack.entities.Favoris;
import com.inti.gestionCodeRouteBack.service.interfaces.IFavorisService;
@Service
public class FavorisService implements IFavorisService{
	
	@Autowired
	FavorisDAO favorisDAO;

	@Override
	public List<Favoris> findAll() {
		return favorisDAO.findAll();
	}

	@Override
	public Favoris findOne(Long idFavoris) {
		return favorisDAO.findById(idFavoris).get();
	}

	@Override
	public Favoris save(Favoris favoris) {
		return favorisDAO.save(favoris);
	}

	@Override
	public void delete(Long idFavoris) {
		favorisDAO.deleteById(idFavoris);
	}

}
