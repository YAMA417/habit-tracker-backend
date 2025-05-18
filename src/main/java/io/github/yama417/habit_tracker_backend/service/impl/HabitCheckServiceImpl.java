package io.github.yama417.habit_tracker_backend.service.impl;

import io.github.yama417.habit_tracker_backend.entity.HabitCheck;
import io.github.yama417.habit_tracker_backend.repository.HabitCheckRepository;
import io.github.yama417.habit_tracker_backend.service.HabitCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HabitCheckServiceImpl implements HabitCheckService {

    private final HabitCheckRepository habitCheckRepository;

    @Autowired
    public HabitCheckServiceImpl(HabitCheckRepository habitCheckRepository) {
        this.habitCheckRepository = habitCheckRepository;
    }

    @Override
    public HabitCheck checkHabit(Long habitId, LocalDate date, boolean isChecked) {
        HabitCheck check = new HabitCheck();
        check.setId(habitId);
        check.setDate(date);
        check.setChecked(isChecked);
        return habitCheckRepository.save(check);
    }

    @Override
    public List<HabitCheck> findByHabitId(Long habitId) {
        return habitCheckRepository.findByHabitId(habitId);
    }
}
