package com.microservice.carrera.controller;

import com.microservice.carrera.entities.Carrera;
import com.microservice.carrera.service.ICarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carrera")
public class CarreraController {
    @Autowired
    private ICarreraService carreraService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCarrera(@RequestBody Carrera carrera) {
        carreraService.save(carrera);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCarrera() {
        return ResponseEntity.ok(carreraService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(carreraService.findById(id));
    }

    @GetMapping("/search-students/{idCarrera}")
    public ResponseEntity<?> findStudentsByIdCarrera(@PathVariable Long idCarrera){
        return ResponseEntity.ok(carreraService.findStudentsByIdCarrera(idCarrera));
    }
}
