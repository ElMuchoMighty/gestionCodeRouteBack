package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Reponse;


public interface IReponseService {
	
	Reponse findOne(Long idReponse);
	
	List<Reponse> findAll();

	Reponse save(Reponse reponse);

	void delete(Long id);

}
