package com.company.airport.repository;

import com.company.airport.model.Route;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository
        extends CrudRepository<Route, Integer> {

    /*
    select r.* from Route r
        inner join Airport a on a.id = r.srcAirport_id
        where a.name=:airportName
     */
    @Query("select r from Route r where r.srcAirport.name=:airportName")
    List<Route> findByAirportName(String airportName);
}
