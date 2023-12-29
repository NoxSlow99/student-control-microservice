package com.microservice.campus.persistence;

import com.microservice.campus.entities.Campus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusReposiroty extends CrudRepository<Campus, Long> {
}
