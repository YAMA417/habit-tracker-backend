package io.github.yama417.habit_tracker_backend.service;

import io.github.yama417.habit_tracker_backend.dto.UsersRequestDTO;
import io.github.yama417.habit_tracker_backend.dto.UsersResponseDTO;
import io.github.yama417.habit_tracker_backend.entity.Users;

import java.util.Optional;

public interface UserService {
    UsersResponseDTO createUser(UsersRequestDTO dto);
    Optional<Users> findByEmail(String email);
}
