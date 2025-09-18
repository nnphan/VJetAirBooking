package com.vjet.VjetAir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjet.VjetAir.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>
{

}
