package com.microservice.carrera.service;

import com.microservice.carrera.client.StudentClient;
import com.microservice.carrera.controller.dto.StudentDTO;
import com.microservice.carrera.entities.Carrera;
import com.microservice.carrera.http.response.StudentByCarreraResponse;
import com.microservice.carrera.persistence.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServiceImpl  implements ICarreraService{

    @Autowired
    private CarreraRepository carreraRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Carrera> findAll() {
        return (List<Carrera>) carreraRepository.findAll();
    }

    @Override
    public Carrera findById(Long id) {
        return carreraRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Carrera carrera) {
        carreraRepository.save(carrera);
    }

    @Override
    public StudentByCarreraResponse findStudentsByIdCarrera(Long idCarrera) {
        // ? Consultar la carrera
        Carrera carrera = carreraRepository.findById(idCarrera).orElse(new Carrera());

        // ? Obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentsByCarrera(idCarrera);

        return StudentByCarreraResponse.builder()
                .name(carrera.getName())
                .studentDTOList(studentDTOList)
                .build();
    }
}
