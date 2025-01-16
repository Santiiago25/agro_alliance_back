package com.project.service.impl;

import com.project.model.dao.FincaRepository;
import com.project.model.entity.Finca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FincaServiceImpl implements IServiceFinca {

    @Autowired
    private FincaRepository fincaRepository;

    @Override
    public List<Finca> listAll() {
        List<Finca> fincas = (List<Finca>) fincaRepository.findAll();
        return fincas;
    }
}
