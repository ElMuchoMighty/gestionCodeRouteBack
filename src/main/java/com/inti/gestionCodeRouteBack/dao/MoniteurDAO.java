package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Moniteur;

@Repository
public interface MoniteurDAO extends JpaRepository<Moniteur,Long>{

}
