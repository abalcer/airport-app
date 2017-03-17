package com.company.airport.repository;

import com.company.airport.model.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository
        extends CrudRepository<Airport, Integer> {


}
