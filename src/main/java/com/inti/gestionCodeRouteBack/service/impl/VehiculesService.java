package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.VehiculesDAO;
import com.inti.gestionCodeRouteBack.entities.Vehicules;
import com.inti.gestionCodeRouteBack.service.interfaces.IVehiculesService;
@Service
public class VehiculesService implements IVehiculesService{
	
	@Autowired
	VehiculesDAO vehiculesDAO;
 
	@Override
	public List<Vehicules> findAll() {
		return vehiculesDAO.findAll();
	}

	@Override
	public Vehicules findOne(Long idVehicules) {
		return vehiculesDAO.findById(idVehicules).get();
	}

	@Override
	public Vehicules save(Vehicules vehicules) {
		return vehiculesDAO.save(vehicules);
	}

	@Override
	public void delete(Long idVehicules) {
		vehiculesDAO.deleteById(idVehicules);
	}

}
