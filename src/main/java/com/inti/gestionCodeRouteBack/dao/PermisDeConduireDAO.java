package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.PermisDeConduire;

@Repository
public interface PermisDeConduireDAO extends JpaRepository<PermisDeConduire,Long>{

}

