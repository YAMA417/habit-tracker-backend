package io.github.yama417.habit_tracker_backend.controller;

import io.github.yama417.habit_tracker_backend.dto.HabitRequestDTO;
import io.github.yama417.habit_tracker_backend.dto.HabitResponseDTO;
import io.github.yama417.habit_tracker_backend.dto.UsersResponseDTO;
import io.github.yama417.habit_tracker_backend.entity.Habit;
import io.github.yama417.habit_tracker_backend.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<HabitResponseDTO> createHabit(@RequestBody HabitRequestDTO habitRequest) {
        HabitResponseDTO response = habitService.createHabit(habitRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<HabitResponseDTO>> getHabitsByUserId(@PathVariable Long userId) {
        List<HabitResponseDTO> responseList = habitService.findByUserId(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseList);
    }
}
