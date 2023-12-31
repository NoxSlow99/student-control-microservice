package com.microservice.division.persistence;

import com.microservice.division.entities.Division;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Long> {

    /*
    * Estos métodos sirven para poder buscar los datos que piden otras API'S
    * (API -> Division)
    */
    @Query("SELECT d.name FROM Division d WHERE d.chetId = :idCampus OR d.canId = :idCampus OR d.pdcId = :idCampus " +
            "OR d.cozId = :idCampus OR d.fcpId = :idCampus")
    List<String> findNameByCampus(Long idCampus);
}
