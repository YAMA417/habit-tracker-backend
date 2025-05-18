package io.github.yama417.habit_tracker_backend.controller;

import io.github.yama417.habit_tracker_backend.entity.HabitCheck;
import io.github.yama417.habit_tracker_backend.service.HabitCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/checks")
public class HabitCheckController {

    private final HabitCheckService habitCheckService;

    @Autowired
    public HabitCheckController(HabitCheckService habitCheckService) {
        this.habitCheckService = habitCheckService;
    }

    @PostMapping
    public HabitCheck checkHabit(@RequestBody HabitCheck check) {
        return habitCheckService.checkHabit(check.getId(), check.getDate(), check.isChecked());
    }

    @GetMapping("/habit/{habitId}")
    public List<HabitCheck> getChecksByHabitId(@PathVariable Long habitId) {
        return habitCheckService.findByHabitId(habitId);
    }
}
