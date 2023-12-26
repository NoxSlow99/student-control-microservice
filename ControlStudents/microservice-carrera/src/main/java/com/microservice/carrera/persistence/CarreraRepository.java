package com.microservice.carrera.persistence;

import com.microservice.carrera.entities.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Long> {
}
