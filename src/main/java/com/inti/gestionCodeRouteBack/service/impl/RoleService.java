package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.RoleDAO;
import com.inti.gestionCodeRouteBack.entities.Role;
import com.inti.gestionCodeRouteBack.service.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService{
	@Autowired
	RoleDAO roleDAO;

	@Override
	public List<Role> findAll() {
	return roleDAO.findAll();
	}

	@Override
	public Role save(Role role) {
	return roleDAO.save(role);
	}

	@Override
	public void delete(Long id) {
		roleDAO.deleteById(id);
		
	}

	@Override
	public Role findOne(Long idRole) {
		
		return roleDAO.findById(idRole).get();
	}

}
