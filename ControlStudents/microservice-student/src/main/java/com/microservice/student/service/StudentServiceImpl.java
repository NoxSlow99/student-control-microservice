package com.microservice.student.service;

import com.microservice.student.entities.Student;
import com.microservice.student.persistence.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findByIdCarrera(Long idCarrera) {
        return studentRepository.findAllByCarreraId(idCarrera);
    }

    @Override
    public List<Student> findByIdCampus(Long idCampus) {
        return studentRepository.findAllByCampuId(idCampus);
    }

    @Override
    public List<Student> findByIdDivCarrera(Long idDivCarrera) {
        return studentRepository.StudentsByDivCarreraId(idDivCarrera);
    }
}
