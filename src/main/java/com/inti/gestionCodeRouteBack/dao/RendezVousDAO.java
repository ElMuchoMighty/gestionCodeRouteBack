package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.RendezVous;

@Repository
public interface RendezVousDAO extends JpaRepository<RendezVous, Long>{

}
