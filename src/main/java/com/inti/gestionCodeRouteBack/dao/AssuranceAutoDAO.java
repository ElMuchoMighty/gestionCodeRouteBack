package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.AssuranceAuto;

@Repository
public interface AssuranceAutoDAO extends JpaRepository<AssuranceAuto,Long>{

}
