// HabitCheckResponseDTO.java
package io.github.yama417.habit_tracker_backend.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class HabitCheckResponseDTO {
    private Long id;
    private LocalDate date;
    private Boolean isChecked;
}
