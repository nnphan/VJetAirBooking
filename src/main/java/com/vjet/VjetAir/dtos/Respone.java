package com.vjet.VjetAir.dtos;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Respone<T> {
    private int statusCode;
    private String message; 
    private T data;
}
