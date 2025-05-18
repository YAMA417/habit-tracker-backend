package io.github.yama417.habit_tracker_backend.service;

import io.github.yama417.habit_tracker_backend.entity.HabitCheck;

import java.time.LocalDate;
import java.util.List;

public interface HabitCheckService {
    HabitCheck checkHabit(Long habitId, LocalDate date, boolean isChecked);
    List<HabitCheck> findByHabitId(Long habitId);
}
