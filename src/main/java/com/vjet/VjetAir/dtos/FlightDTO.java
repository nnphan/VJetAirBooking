package com.vjet.VjetAir.dtos;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import com.vjet.VjetAir.entities.Airport;
import com.vjet.VjetAir.entities.Booking;
import com.vjet.VjetAir.entities.User;
import com.vjet.VjetAir.enums.FlightStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {

    private Long id;

    private String flightNumber;

    private FlightStatus flightStatus;

    private Airport departureAirport;

    private Airport arrivalAirport;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;

    private User assignedPilot;

    private List<Booking> bookings;

    private String departureAirportIataCode;
    
    private String arrivalAirportIataCode;
}
