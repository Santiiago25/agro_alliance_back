package com.project.service.impl;

import com.project.model.dao.ActividadAgronomicaRepository;
import com.project.model.entity.ActividadAgronomica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadAgronomicaServiceImpl implements IServiceActividadAgronomica{

    @Autowired
    private ActividadAgronomicaRepository actividadAgronomicaRepository;

    @Override
    public List<ActividadAgronomica> listAll() {
        List<ActividadAgronomica> actividadesAgronomicas = (List<ActividadAgronomica>) actividadAgronomicaRepository.findAll();
        return actividadesAgronomicas;
    }
}
