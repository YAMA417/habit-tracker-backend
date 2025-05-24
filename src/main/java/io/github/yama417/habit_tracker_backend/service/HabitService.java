package io.github.yama417.habit_tracker_backend.service;

import io.github.yama417.habit_tracker_backend.dto.HabitRequestDTO;
import io.github.yama417.habit_tracker_backend.dto.HabitResponseDTO;
import io.github.yama417.habit_tracker_backend.entity.Habit;

import java.util.List;
import java.util.Optional;

public interface HabitService {
    HabitResponseDTO createHabit(HabitRequestDTO dto);
    List<HabitResponseDTO> findByUserId(Long userId);
}
