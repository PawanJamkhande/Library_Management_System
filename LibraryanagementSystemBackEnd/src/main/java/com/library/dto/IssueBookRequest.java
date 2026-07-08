package com.library.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class IssueBookRequest {
    // this tells which book is issued to which user
    @NotNull(message = "User Id is required")
    private Long userId;

    @NotNull(message = "Book Id is required")
    private Long bookId;

}
