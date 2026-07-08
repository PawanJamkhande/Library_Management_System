package com.library.dto;

import lombok.Data;

@Data
public class UserResponse {
// it sends the safe user object back to the client
    private Long userId;
    private String fullName;
    private String email;
    private String mobile;
    private String role;

}
