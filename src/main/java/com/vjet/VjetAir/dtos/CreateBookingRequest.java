package com.vjet.VjetAir.dtos;
import java.util.List;
import lombok.Data;

@Data
public class CreateBookingRequest {
    private Long flightId;
    private List<PassengerDTO> passengers;
}
