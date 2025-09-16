package com.vjet.VjetAir.dtos;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistrationRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password number is required")
    private String password;

    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    private List<String> roles;

}
