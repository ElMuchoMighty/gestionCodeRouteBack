package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.ExamenBlancDAO;
import com.inti.gestionCodeRouteBack.entities.ExamenBlanc;
import com.inti.gestionCodeRouteBack.service.interfaces.IExamenBlancService;

@Service
public class ExamenBlancService implements IExamenBlancService{
	@Autowired
	ExamenBlancDAO examenBlancDAO;

	@Override
	public List<ExamenBlanc> findAll() {
		return examenBlancDAO.findAll();
	}

	@Override
	public ExamenBlanc save(ExamenBlanc examenBlanc) {
		
		return examenBlancDAO.save(examenBlanc);
	}

	@Override
	public void delete(Long id) {
		examenBlancDAO.deleteById(id);
		
	}

	@Override
	public ExamenBlanc findOne(Long idExamenBlanc) {
	
		return examenBlancDAO.findById(idExamenBlanc).get();
	}

}
