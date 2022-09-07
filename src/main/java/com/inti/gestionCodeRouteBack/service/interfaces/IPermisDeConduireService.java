package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.PermisDeConduire;

public interface IPermisDeConduireService {
	List<PermisDeConduire> findAll();

	PermisDeConduire findOne(Long idPermisDeConduire);

	PermisDeConduire save(PermisDeConduire permisDeConduire);

	void delete(Long idPermisDeConduire);
}
