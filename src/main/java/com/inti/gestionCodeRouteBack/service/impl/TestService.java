package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.TestDAO;
import com.inti.gestionCodeRouteBack.entities.Test;
import com.inti.gestionCodeRouteBack.service.interfaces.ITestService;


@Service
public class TestService implements ITestService{
	@Autowired
	TestDAO testDAO;

	@Override
	public List<Test> findAll() {
		
		return testDAO.findAll();
	}

	@Override
	public Test save(Test test) {
		return testDAO.save(test);
	}

	@Override
	public void delete(Long id) {
		testDAO.deleteById(id);
		
	}

	@Override
	public Test findOne(Long idTest) {
		return testDAO.findById(idTest).get();
	}

}
