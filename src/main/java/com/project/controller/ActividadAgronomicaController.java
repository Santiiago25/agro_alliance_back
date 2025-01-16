package com.project.controller;

import com.project.model.entity.ActividadAgronomica;
import com.project.service.impl.IServiceActividadAgronomica;
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
public class ActividadAgronomicaController {
    @Autowired
    private IServiceActividadAgronomica serviceActividadAgronomica;

    @GetMapping("actividades")
    public ResponseEntity<List<ActividadAgronomica>> listAll(){
        List<ActividadAgronomica> actividades = serviceActividadAgronomica.listAll();
        return ResponseEntity.ok(actividades);
    }
}
