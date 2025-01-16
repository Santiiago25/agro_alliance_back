package com.project.model.dao;

import com.project.model.entity.ActividadAgronomica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadAgronomicaRepository extends JpaRepository<ActividadAgronomica,Long> {
}
