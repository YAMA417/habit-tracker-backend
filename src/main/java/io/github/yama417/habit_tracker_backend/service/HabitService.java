package io.github.yama417.habit_tracker_backend.service;

import io.github.yama417.habit_tracker_backend.entity.Habit;

import java.util.List;
import java.util.Optional;

public interface HabitService {
    Habit createHabit(Habit habit);
    List<Habit> findByUserId(Long userId);
}
