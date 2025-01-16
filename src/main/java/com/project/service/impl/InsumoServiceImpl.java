package com.project.service.impl;

import com.project.model.dao.InsumoRepository;
import com.project.model.entity.Insumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsumoServiceImpl implements IServiceInsumo {

    @Autowired
    private InsumoRepository insumoRepository;

    @Override
    public List<Insumo> listAll() {
        List<Insumo> insumos = insumoRepository.findAll();
        return insumos;
    }
}
