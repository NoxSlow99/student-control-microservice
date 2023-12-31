package com.microservice.division.service;

import com.microservice.division.Http.response.CarrerasByDivisionResponse;
import com.microservice.division.Http.response.StudentsByDivisionResponse;
import com.microservice.division.client.CarreraClient;
import com.microservice.division.client.StudentClient;
import com.microservice.division.controller.dto.CarreraDTO;
import com.microservice.division.controller.dto.StudentDTO;
import com.microservice.division.entities.Division;
import com.microservice.division.persistence.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {
    @Autowired
    private DivisionRepository divisionRepository;
    @Autowired
    private CarreraClient carreraClient;
    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Division> findAll() {
        return (List<Division>) divisionRepository.findAll();
    }

    @Override
    public Division findById(Long id) {
        return divisionRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Division division) {
        divisionRepository.save(division);
    }

    // * API -> Division
    @Override
    public List<String> findNameByCampus(Long idCampus) {
        return divisionRepository.findNameByCampus(idCampus);
    }

    // * Division -> API
    @Override
    public CarrerasByDivisionResponse findCarrerasByDivision(Long idDiv) {
        Division division = divisionRepository.findById(idDiv).orElse(new Division());
        List<CarreraDTO> carreraDTOS = carreraClient.findAllCarrerasByDivision(idDiv);

        return CarrerasByDivisionResponse.builder()
                .name(division.getName())
                .carreras(carreraDTOS)
                .build();
    }

    @Override
    public StudentsByDivisionResponse findStudentsByDivision(Long idDiv) {
        Division division = divisionRepository.findById(idDiv).orElse(new Division());
        List<StudentDTO> studentDTOS = studentClient.findStudentsByDivision(idDiv);

        return StudentsByDivisionResponse.builder()
                .name(division.getName())
                .students(studentDTOS)
                .build();
    }
}
