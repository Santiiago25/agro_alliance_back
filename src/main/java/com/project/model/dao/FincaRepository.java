package com.project.model.dao;

import com.project.model.entity.Finca;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FincaRepository extends CrudRepository<Finca, Long> {
}
