package com.project.controller;

import com.project.model.entity.Parcela;
import com.project.service.impl.IServiceParcela;
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
public class ParcelaContoller {
    @Autowired
    private IServiceParcela serviceParcela;

    @GetMapping("parcelas")
    public ResponseEntity<List<Parcela>> listAll(){
        List<Parcela> parcelas = serviceParcela.listAll();
        return ResponseEntity.ok(parcelas);
    }
}
