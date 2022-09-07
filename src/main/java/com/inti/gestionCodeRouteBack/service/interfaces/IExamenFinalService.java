package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.ExamenFinal;



public interface IExamenFinalService {
	
	ExamenFinal findOne(Long idExamenFinal);
	
	List<ExamenFinal> findAll();

	ExamenFinal save(ExamenFinal examenFinal);

	void delete(Long id);
}
