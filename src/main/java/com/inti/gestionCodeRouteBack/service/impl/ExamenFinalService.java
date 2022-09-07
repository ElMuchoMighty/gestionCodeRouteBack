package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.ExamenFinalDAO;
import com.inti.gestionCodeRouteBack.entities.ExamenFinal;
import com.inti.gestionCodeRouteBack.service.interfaces.IExamenFinalService;

@Service
public class ExamenFinalService implements IExamenFinalService{
	@Autowired
	ExamenFinalDAO examenFinalDAO;

	@Override
	public List<ExamenFinal> findAll() {
		return examenFinalDAO.findAll();
	}

	@Override
	public ExamenFinal save(ExamenFinal examenFinal) {
		return examenFinalDAO.save(examenFinal);
	}

	@Override
	public void delete(Long id) {
		examenFinalDAO.deleteById(id);
		
	}

	@Override
	public ExamenFinal findOne(Long idExamenFinal) {
		return examenFinalDAO.findById(idExamenFinal).get();
	}

}
