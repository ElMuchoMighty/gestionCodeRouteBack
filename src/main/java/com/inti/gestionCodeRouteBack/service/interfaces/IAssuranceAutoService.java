package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.AssuranceAuto;

public interface IAssuranceAutoService {
	List<AssuranceAuto> findAll();

	AssuranceAuto findOne(Long idAssuranceAuto);

	AssuranceAuto save(AssuranceAuto assuranceAuto);

	void delete(Long idAssuranceAuto);
}
