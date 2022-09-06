package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.AutoEcole;

public interface IAutoEcoleService {
	List<AutoEcole> findAll();

	AutoEcole findOne(Long idAutoEcole);

	AutoEcole save(AutoEcole autoEcole);

	void delete(Long idAutoEcole);
}
