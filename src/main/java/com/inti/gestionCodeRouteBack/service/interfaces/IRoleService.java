package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Role;



public interface IRoleService {
	
	Role findOne(Long idRole);

	List<Role> findAll();

	Role save(Role role);

	void delete(Long id);
	
}
