package com.project.controller;

import com.project.model.dao.InsumoRepository;
import com.project.model.entity.Insumo;
import com.project.service.impl.IServiceInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class InsumoController {
    @Autowired
    private IServiceInsumo serviceInsumo;

    @GetMapping("insumos")
    public ResponseEntity<List<Insumo>> listAll(){
        List<Insumo> insumos = serviceInsumo.listAll();
        return ResponseEntity.ok(insumos);
    }

}
