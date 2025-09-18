package com.vjet.VjetAir.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjet.VjetAir.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>
{
    boolean existsByFlightNumber(String flightNumber);
    
    //List<Flight> findFlight(String departureStringIataCode, String arrivalStringIataCode, LocalDateTime date);
    
}
