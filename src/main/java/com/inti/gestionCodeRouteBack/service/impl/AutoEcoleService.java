package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.AutoEcoleDAO;
import com.inti.gestionCodeRouteBack.entities.AutoEcole;
import com.inti.gestionCodeRouteBack.service.interfaces.IAutoEcoleService;
@Service
public class AutoEcoleService implements IAutoEcoleService{
	
	@Autowired
	AutoEcoleDAO autoEcoleDAO;
 
	@Override
	public List<AutoEcole> findAll() {
		return autoEcoleDAO.findAll();
	}

	@Override
	public AutoEcole findOne(Long idAutoEcole) {
		return autoEcoleDAO.findById(idAutoEcole).get();
	}

	@Override
	public AutoEcole save(AutoEcole autoEcole) {
		return autoEcoleDAO.save(autoEcole);
	}

	@Override
	public void delete(Long idAutoEcole) {
		autoEcoleDAO.deleteById(idAutoEcole);
	}

}
