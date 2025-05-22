// HabitRequestDTO.java
package io.github.yama417.habit_tracker_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class HabitRequestDTO {
    @NotBlank
    private String title;

    private String description;

    @NotNull
    private List<String> scheduledDays;

    @NotNull
    private Long userId;
}
