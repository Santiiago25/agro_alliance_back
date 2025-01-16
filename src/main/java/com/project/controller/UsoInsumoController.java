package com.project.controller;

import com.project.model.entity.UsoInsumo;
import com.project.service.impl.IServiceUsoInsumo;
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
public class UsoInsumoController {
    @Autowired
    private IServiceUsoInsumo serviceUsoInsumo;

    @GetMapping("usos-insumos")
    public ResponseEntity<List<UsoInsumo>> listAll(){
        List<UsoInsumo> usosInsumos = serviceUsoInsumo.listAll();
        return ResponseEntity.ok(usosInsumos);
    }

}
