package com.vjet.VjetAir.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjet.VjetAir.entities.Airport;
import com.vjet.VjetAir.entities.User;

public interface AirportRepository extends JpaRepository<Airport, Long>
{
    Optional<User> findByIataCode(String iataCode);
    
}
