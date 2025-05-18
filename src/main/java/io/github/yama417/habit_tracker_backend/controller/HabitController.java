package io.github.yama417.habit_tracker_backend.controller;

import io.github.yama417.habit_tracker_backend.entity.Habit;
import io.github.yama417.habit_tracker_backend.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habits")
public class HabitController {

    private final HabitService habitService;

    @Autowired
    public HabitController(HabitService habitService) {
        this.habitService = habitService;
    }

    @PostMapping
    public Habit createHabit(@RequestBody Habit habit) {
        return habitService.createHabit(habit);
    }

    @GetMapping("/user/{userId}")
    public List<Habit> getHabitsByUserId(@PathVariable Long userId) {
        return habitService.findByUserId(userId);
    }
}
