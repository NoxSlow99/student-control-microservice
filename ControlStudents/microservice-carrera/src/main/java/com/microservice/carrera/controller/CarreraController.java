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

    // * Consumiendo otros microservicios (Carrera -> API)
    @GetMapping("/search-students/{idCarrera}")
    public ResponseEntity<?> findStudentsByIdCarrera(@PathVariable Long idCarrera){
        return ResponseEntity.ok(carreraService.findStudentsByIdCarrera(idCarrera));
    }

    // * EndPoints que lo consuman otras API'S (API -> Carrera)
    @GetMapping("/search-by-campus/{idCampus}")
    public ResponseEntity<?> findAllByIdCampus(@PathVariable Long idCampus) {
        return ResponseEntity.ok(carreraService.findAllByIdCampus(idCampus));
    }

    @GetMapping("/search-division/{idDiv}")
    public ResponseEntity<?> findNameByDivision(@PathVariable Long idDiv) {
        return ResponseEntity.ok(carreraService.findNameByDivision(idDiv));
    }
}
