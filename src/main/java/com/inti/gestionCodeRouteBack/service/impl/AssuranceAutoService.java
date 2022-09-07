package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.AssuranceAutoDAO;
import com.inti.gestionCodeRouteBack.entities.AssuranceAuto;
import com.inti.gestionCodeRouteBack.service.interfaces.IAssuranceAutoService;
@Service
public class AssuranceAutoService implements IAssuranceAutoService{
	
	@Autowired
	AssuranceAutoDAO assuranceAutoDAO;
 
	@Override
	public List<AssuranceAuto> findAll() {
		return assuranceAutoDAO.findAll();
	}

	@Override
	public AssuranceAuto findOne(Long idAssuranceAuto) {
		return assuranceAutoDAO.findById(idAssuranceAuto).get();
	}

	@Override
	public AssuranceAuto save(AssuranceAuto assuranceAuto) {
		return assuranceAutoDAO.save(assuranceAuto);
	}

	@Override
	public void delete(Long idAssuranceAuto) {
		assuranceAutoDAO.deleteById(idAssuranceAuto);
	}

}
