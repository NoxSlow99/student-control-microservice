package com.microservice.campus.service;

import com.microservice.campus.client.CarreraClient;
import com.microservice.campus.client.DivisionClient;
import com.microservice.campus.client.StudentClient;
import com.microservice.campus.controller.dto.CarrerasDTO;
import com.microservice.campus.controller.dto.DivisionDTO;
import com.microservice.campus.controller.dto.StudentDTO;
import com.microservice.campus.entities.Campus;
import com.microservice.campus.http.response.CarrerasByCampusResponse;
import com.microservice.campus.http.response.DivisionByCampusResponse;
import com.microservice.campus.http.response.StudentByCampusResponse;
import com.microservice.campus.persistence.CampusReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampusServiceImpl implements ICampusService {

    @Autowired
    private CampusReposiroty campusReposiroty;
    @Autowired
    private StudentClient studentClient;
    @Autowired
    private CarreraClient carreraClient;
    @Autowired
    private DivisionClient divisionClient;

    @Override
    public List<Campus> findAll() {
        return (List<Campus>) campusReposiroty.findAll();
    }

    @Override
    public Campus findById(Long idCampus) {
        return campusReposiroty.findById(idCampus).orElseThrow();
    }

    @Override
    public void save(Campus campus) {
        campusReposiroty.save(campus);
    }

    // * Campus -> APIS
    @Override
    public StudentByCampusResponse findStudentsByIdCampus(Long idCampus) {
        // ? Consultar campus
        Campus campus = campusReposiroty.findById(idCampus).orElse(new Campus());

        // ? Obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentsByCampus(idCampus);

        return StudentByCampusResponse.builder()
                .name(campus.getName())
                .studentDTOList(studentDTOList)
                .build();
    }

    @Override
    public CarrerasByCampusResponse findCarrerasByIdCampus(Long idCampus) {
        Campus campus = campusReposiroty.findById(idCampus).orElse(new Campus());

        List<CarrerasDTO> carrerasDTOList = carreraClient.findAllCarrerasByIdCampus(idCampus);

        return CarrerasByCampusResponse.builder()
                .name(campus.getName())
                .carrerasDTOList(carrerasDTOList)
                .build();
    }

    @Override
    public DivisionByCampusResponse findDivisionByIdCampus(Long idCampus) {
        Campus campus = campusReposiroty.findById(idCampus).orElse(new Campus());
        List<DivisionDTO> divisionDTOList = divisionClient.findAllDivisionByIdCampus(idCampus);

        return DivisionByCampusResponse.builder()
                .name(campus.getName())
                .division(divisionDTOList)
                .build();
    }
}
