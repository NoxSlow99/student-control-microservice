package com.microservice.campus.controller;

import com.microservice.campus.entities.Campus;
import com.microservice.campus.service.ICampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/campus")
public class CampusController {

    @Autowired
    private ICampusService campusService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCampus(@RequestBody Campus campus) {
        campusService.save(campus);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCampus() {
        return ResponseEntity.ok(campusService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(campusService.findById(id));
    }

    // * Métodos para hacer peticiones a otras API'S (Campus -> API)
    @GetMapping("/search-students/{idCampus}")
    public ResponseEntity<?> findStudentsByIdCampus(@PathVariable Long idCampus){
        return ResponseEntity.ok(campusService.findStudentsByIdCampus(idCampus));
    }

    @GetMapping("/search-carreras/{idCampus}")
    public ResponseEntity<?> findCarrerasByIdCampus(@PathVariable Long idCampus) {
        return ResponseEntity.ok(campusService.findCarrerasByIdCampus(idCampus));
    }

    @GetMapping("/search-division/{idCampus}")
    public ResponseEntity<?> findDivisionByIdCampus(@PathVariable Long idCampus) {
        return ResponseEntity.ok(campusService.findDivisionByIdCampus(idCampus));
    }
}
