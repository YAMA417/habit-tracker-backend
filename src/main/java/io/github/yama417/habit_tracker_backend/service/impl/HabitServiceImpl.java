package io.github.yama417.habit_tracker_backend.service.impl;

import io.github.yama417.habit_tracker_backend.dto.HabitRequestDTO;
import io.github.yama417.habit_tracker_backend.dto.HabitResponseDTO;
import io.github.yama417.habit_tracker_backend.entity.Habit;
import io.github.yama417.habit_tracker_backend.entity.Users;
import io.github.yama417.habit_tracker_backend.mapper.HabitMapper;
import io.github.yama417.habit_tracker_backend.mapper.UsersMapper;
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
    public HabitResponseDTO createHabit(HabitRequestDTO habitDto) {
        Habit habit = HabitMapper.toEntity(habitDto);
        Habit saved = habitRepository.save(habit);
        return HabitMapper.toDto(saved);
    }

    @Override
    public List<HabitResponseDTO> findByUserId(Long userId) {
        List<Habit> resultHabits = habitRepository.findByUserId(userId);
        return HabitMapper.toDtoList(resultHabits);
    }
}