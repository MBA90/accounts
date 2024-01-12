package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseDTO {

    private String apiPath;

    private HttpStatus httpStatus;

    private String errorMessage;

    private LocalDateTime errorTime;
}
