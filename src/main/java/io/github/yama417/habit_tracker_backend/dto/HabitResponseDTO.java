// HabitResponseDTO.java
package io.github.yama417.habit_tracker_backend.dto;

import lombok.Data;

import java.util.List;

@Data
public class HabitResponseDTO {
    private Long id;
    private String title;
    private String description;
    private List<String> scheduledDays;
    private Long userId;
}
