package io.github.yama417.habit_tracker_backend.service;

import io.github.yama417.habit_tracker_backend.entity.Users;

import java.util.Optional;

public interface UserService {
    Users createUser(Users user);
    Optional<Users> findByEmail(String email);
}
