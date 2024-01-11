package com.microservice.student.controller;

import com.microservice.student.entities.Student;
import com.microservice.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    // ? Configurando EndPoint para que otros microservicios puedan consumir el microservicio de "Student"
    @GetMapping("/search-by-carrera/{idCarrera}")
    public ResponseEntity<?> findByCarrera(@PathVariable Long idCarrera) {
        return ResponseEntity.ok(studentService.findByIdCarrera(idCarrera));
    }

    @GetMapping("/search-by-campus/{idCampus}")
    public ResponseEntity<?> findByCampus(@PathVariable Long idCampus) {
        return ResponseEntity.ok(studentService.findByIdCampus(idCampus));
    }

    @GetMapping("/search-by-division/{idDivCarrera}")
    public ResponseEntity<?> findByDivCarrera(@PathVariable Long idDivCarrera) {
        return ResponseEntity.ok(studentService.findByIdDivCarrera(idDivCarrera));
    }
}
