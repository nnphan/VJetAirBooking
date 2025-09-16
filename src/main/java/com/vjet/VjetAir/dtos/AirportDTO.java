package com.vjet.VjetAir.dtos;
import com.vjet.VjetAir.enums.City;
import com.vjet.VjetAir.enums.Country;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportDTO {

    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "City is required")
    private City city;

    @NotBlank(message = "Country is required")
    private  Country country;

    @NotBlank(message = "Code is required")
    private String iataCode;
}
