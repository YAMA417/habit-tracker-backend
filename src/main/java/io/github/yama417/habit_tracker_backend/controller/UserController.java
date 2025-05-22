package io.github.yama417.habit_tracker_backend.controller;

import io.github.yama417.habit_tracker_backend.dto.UsersRequestDTO;
import io.github.yama417.habit_tracker_backend.dto.UsersResponseDTO;
import io.github.yama417.habit_tracker_backend.entity.Users;
import io.github.yama417.habit_tracker_backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UsersResponseDTO> createUser(@Valid @RequestBody UsersRequestDTO dto) {
        UsersResponseDTO response = userService.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<Users> getUserByEmail(@RequestParam String email) {
        return userService.findByEmail(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
