package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.ExamenFinal;

@Repository
public interface ExamenFinalDAO extends JpaRepository<ExamenFinal, Long>{

}
