package com.vjet.VjetAir.dtos;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.vjet.VjetAir.enums.FlightStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateFilghtRequest {

    private FlightStatus status;

    private String flightNumber;

    private String departureAirportIataCode;

    private String arrivalAirportIataCode;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;

    private Long pilotId;

}
