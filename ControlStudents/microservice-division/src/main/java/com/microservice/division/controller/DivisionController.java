package com.microservice.division.controller;

import com.microservice.division.entities.Division;
import com.microservice.division.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/division")
public class DivisionController {
    @Autowired
    private IDivisionService divisionService;

    @GetMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDivision(@RequestBody Division division) {
        divisionService.save(division);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(divisionService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(divisionService.findById(id));
    }

    // ? EndPoints para consumir otros microservicios (Division -> API)
    @GetMapping("/search-carreras/{idDivision}")
    public ResponseEntity<?> findCarrerasByDivision (@PathVariable Long idDivision) {
        return ResponseEntity.ok(divisionService.findCarrerasByDivision(idDivision));
    }

    @GetMapping("/search-students/{idDivision}")
    public ResponseEntity<?> findStudentsByDivision (@PathVariable Long idDivision) {
        return ResponseEntity.ok(divisionService.findStudentsByDivision(idDivision));
    }

    // ? EndPoints para que otros microservicios puedan usar el microservicio Division (API -> Division)
    @GetMapping("/search-name/{idCampus}")
    public ResponseEntity<?> findNameByCampus(@PathVariable Long idCampus) {
        return ResponseEntity.ok(divisionService.findNameByCampus(idCampus));
    }
}
