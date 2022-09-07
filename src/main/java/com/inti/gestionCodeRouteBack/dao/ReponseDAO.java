package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Reponse;

@Repository
public interface ReponseDAO extends JpaRepository<Reponse, Long>{

}
