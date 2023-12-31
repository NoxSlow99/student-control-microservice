package com.microservice.carrera.persistence;

import com.microservice.carrera.entities.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Long> {

    // * APIS -> Carrera
    @Query("SELECT c.name FROM Carrera c WHERE c.chetId = :idCampus OR c.canId = :idCampus OR c.pdcId = :idCampus " +
            "OR c.cozId = :idCampus OR c.fcpId = :idCampus")
    List<String> findAllByCampusId(Long idCampus);

    @Query("SELECT c.name FROM Carrera c WHERE c.divCarreraId = :idDiv")
    List<String> findNameByDivision(Long idDiv);
}
