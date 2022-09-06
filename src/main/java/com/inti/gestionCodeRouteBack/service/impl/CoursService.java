package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.CoursDAO;
import com.inti.gestionCodeRouteBack.entities.Cours;
import com.inti.gestionCodeRouteBack.service.interfaces.ICoursService;
@Service
public class CoursService implements ICoursService{
	
	@Autowired
	CoursDAO coursDAO;

	@Override
	public List<Cours> findAll() {
		return coursDAO.findAll();
	}

	@Override
	public Cours findOne(Long idCours) {
		return coursDAO.findById(idCours).get();
	}

	@Override
	public Cours save(Cours cours) {
		return coursDAO.save(cours);
	}

	@Override
	public void delete(Long idCours) {
		coursDAO.deleteById(idCours);
	}

}
