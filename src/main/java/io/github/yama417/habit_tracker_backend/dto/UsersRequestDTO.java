package io.github.yama417.habit_tracker_backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsersRequestDTO {
    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
