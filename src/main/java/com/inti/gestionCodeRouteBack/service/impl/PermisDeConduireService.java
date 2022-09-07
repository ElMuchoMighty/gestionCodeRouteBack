package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.PermisDeConduireDAO;
import com.inti.gestionCodeRouteBack.entities.PermisDeConduire;
import com.inti.gestionCodeRouteBack.service.interfaces.IPermisDeConduireService;
@Service
public class PermisDeConduireService implements IPermisDeConduireService{
	
	@Autowired
	PermisDeConduireDAO permisDeConduireDAO;
 
	@Override
	public List<PermisDeConduire> findAll() {
		return permisDeConduireDAO.findAll();
	}

	@Override
	public PermisDeConduire findOne(Long idPermisDeConduire) {
		return permisDeConduireDAO.findById(idPermisDeConduire).get();
	}

	@Override
	public PermisDeConduire save(PermisDeConduire permisDeConduire) {
		return permisDeConduireDAO.save(permisDeConduire);
	}

	@Override
	public void delete(Long idPermisDeConduire) {
		permisDeConduireDAO.deleteById(idPermisDeConduire);
	}

}
