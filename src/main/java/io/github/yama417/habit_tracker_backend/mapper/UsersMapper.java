package io.github.yama417.habit_tracker_backend.mapper;

import io.github.yama417.habit_tracker_backend.dto.*;
import io.github.yama417.habit_tracker_backend.entity.Users;


public class UsersMapper {

    public static Users toEntity(UsersRequestDTO dto) {
        return new Users(null, dto.getEmail(), dto.getPassword());
    }

    public static UsersResponseDTO toDTO(Users entity) {
        UsersResponseDTO dto = new UsersResponseDTO();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        return dto;
    }
}
