package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.ExamenBlanc;

@Repository
public interface ExamenBlancDAO extends JpaRepository<ExamenBlanc, Long>{

}
