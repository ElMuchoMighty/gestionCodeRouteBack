package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Vehicules;

public interface IVehiculesService {
	List<Vehicules> findAll();

	Vehicules findOne(Long idVehicules);

	Vehicules save(Vehicules vehicules);

	void delete(Long idVehicules);
}
