package com.project.service.impl;

import com.project.model.dao.UsoInsumoRepository;
import com.project.model.entity.UsoInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsoInsumoServiceImpl implements IServiceUsoInsumo {
    @Autowired
    private UsoInsumoRepository usoInsumoRepository;

    @Override
    public List<UsoInsumo> listAll() {
        List<UsoInsumo> usoInsumos = usoInsumoRepository.findAll();
        return usoInsumos;
    }

}
