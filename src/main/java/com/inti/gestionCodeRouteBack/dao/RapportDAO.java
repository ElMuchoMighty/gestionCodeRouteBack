package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Rapport;

@Repository
public interface RapportDAO extends JpaRepository<Rapport, Long>{

}
