package com.vjet.VjetAir.dtos;
import com.vjet.VjetAir.entities.Booking;
import com.vjet.VjetAir.enums.PassengerType;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDTO {

    private Long id;

    private Booking booking;

    @NotBlank(message = "FirstName is required")
    private String firstName;

    @NotBlank(message = "LastName is required")
    private String lastName;

    @NotBlank(message = "PassportNumber is required") 
    private String passportNumber;

    @NotBlank(message = "SeatNumber is required")
    private String seatNumber;

    private String specialRequest;

    private PassengerType type;
}
