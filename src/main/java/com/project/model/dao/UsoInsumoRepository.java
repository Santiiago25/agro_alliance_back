package com.project.model.dao;

import com.project.model.entity.UsoInsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsoInsumoRepository extends JpaRepository<UsoInsumo, Long> {
}
