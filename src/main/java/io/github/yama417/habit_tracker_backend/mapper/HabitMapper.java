package io.github.yama417.habit_tracker_backend.mapper;

import io.github.yama417.habit_tracker_backend.dto.HabitRequestDTO;
import io.github.yama417.habit_tracker_backend.dto.HabitResponseDTO;
import io.github.yama417.habit_tracker_backend.dto.UsersRequestDTO;
import io.github.yama417.habit_tracker_backend.dto.UsersResponseDTO;
import io.github.yama417.habit_tracker_backend.entity.Habit;
import io.github.yama417.habit_tracker_backend.entity.Users;

import java.util.List;
import java.util.stream.Collectors;

public class HabitMapper {
    public static Habit toEntity(HabitRequestDTO dto) {
        Users user = new Users();
        user.setId(dto.getUserId()); // IDだけをセット

        Habit habit = new Habit();
        habit.setTitle(dto.getTitle());
        habit.setDescription(dto.getDescription());
        habit.setScheduledDays(dto.getScheduledDays());
        habit.setUser(user);

        return habit;
    }

    public static HabitResponseDTO toDto(Habit habit) {
        HabitResponseDTO dto = new HabitResponseDTO();
        dto.setId(habit.getId());
        dto.setTitle(habit.getTitle());
        dto.setDescription(habit.getDescription());
        dto.setScheduledDays(habit.getScheduledDays());
        dto.setUserId(habit.getUser().getId());
        return dto;
    }

    public static List<HabitResponseDTO> toDtoList(List<Habit> habits) {
        return habits.stream()
                .map(HabitMapper::toDto)
                .collect(Collectors.toList());
    }
}
