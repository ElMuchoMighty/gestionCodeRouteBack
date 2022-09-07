package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Vehicules;

@Repository
public interface VehiculesDAO extends JpaRepository<Vehicules,Long>{

}

