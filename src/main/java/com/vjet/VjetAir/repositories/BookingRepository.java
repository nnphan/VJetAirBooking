package com.vjet.VjetAir.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjet.VjetAir.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>
{
    List<Booking> findListBookingByUserId(Long userId);
    
}
