package io.github.yama417.habit_tracker_backend.service.impl;

import io.github.yama417.habit_tracker_backend.entity.Habit;
import io.github.yama417.habit_tracker_backend.repository.HabitRepository;
import io.github.yama417.habit_tracker_backend.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitServiceImpl implements HabitService {

    private final HabitRepository habitRepository;

    @Autowired
    public HabitServiceImpl(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    @Override
    public Habit createHabit(Habit habit) {
        return habitRepository.save(habit);
    }

    @Override
    public List<Habit> findByUserId(Long userId) {
        return habitRepository.findByUserId(userId);
    }
}