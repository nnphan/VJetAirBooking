package com.vjet.VjetAir.dtos;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.vjet.VjetAir.entities.Flight;
import com.vjet.VjetAir.entities.Passenger;
import com.vjet.VjetAir.entities.User;
import com.vjet.VjetAir.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {

    private Long id;

    private String bookingReference;

    private User user;

    private Flight flight;

    private LocalDateTime createdDate;

    private BookingStatus bookingStatus;

    private List<Passenger> passengerS = new ArrayList<>();
}
