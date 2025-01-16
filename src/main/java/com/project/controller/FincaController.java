package com.project.controller;

import com.project.model.entity.Finca;
import com.project.service.impl.IServiceFinca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class FincaController {

    @Autowired
    private IServiceFinca serviceFinca;

    @GetMapping("fincas")
    public ResponseEntity<List<Finca>> listAll(){
        List<Finca> fincas = serviceFinca.listAll();
        return ResponseEntity.ok(fincas);
    }

}
