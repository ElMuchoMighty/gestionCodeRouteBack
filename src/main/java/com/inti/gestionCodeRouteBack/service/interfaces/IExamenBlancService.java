package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.ExamenBlanc;


public interface IExamenBlancService {
	
	ExamenBlanc findOne(Long idExamenBlanc);
	
	List<ExamenBlanc> findAll();

	ExamenBlanc save(ExamenBlanc examenBlanc);

	void delete(Long id);
}
