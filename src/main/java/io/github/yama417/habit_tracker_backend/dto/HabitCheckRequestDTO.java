// HabitCheckRequestDTO.java
package io.github.yama417.habit_tracker_backend.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class HabitCheckRequestDTO {
    @NotNull
    private Long habitId;

    @NotNull
    private LocalDate date;

    @NotNull
    private Boolean isChecked;
}
