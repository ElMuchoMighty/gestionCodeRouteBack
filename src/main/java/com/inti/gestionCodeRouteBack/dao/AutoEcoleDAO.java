package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.AutoEcole;

@Repository
public interface AutoEcoleDAO extends JpaRepository<AutoEcole,Long>{

}

