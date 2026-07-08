package com.library.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
// it is a standard API response wrapper 
    private boolean success;

    private String message;

    private Object data;

}
