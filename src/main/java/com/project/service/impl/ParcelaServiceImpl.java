package com.project.service.impl;

import com.project.model.dao.ParcelaRepository;
import com.project.model.entity.Parcela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelaServiceImpl implements IServiceParcela{

    @Autowired
    private ParcelaRepository parcelaRepository;

    @Override
    public List<Parcela> listAll() {
        List<Parcela> parcelas = (List<Parcela>) parcelaRepository.findAll();
        return parcelas;
    }
}
