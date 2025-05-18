package io.github.yama417.habit_tracker_backend.controller;

import io.github.yama417.habit_tracker_backend.entity.Users;
import io.github.yama417.habit_tracker_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<Users> getUsers(@RequestBody String email) {
        return userService.findByEmail(email).stream().toList();
    }

}
