package io.github.yama417.habit_tracker_backend.service.impl;

import io.github.yama417.habit_tracker_backend.entity.Users;
import io.github.yama417.habit_tracker_backend.repository.UserRepository;
import io.github.yama417.habit_tracker_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository usersRepository;

    @Autowired
    public UserServiceImpl(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public Optional<Users> findByEmail(String email) {
        return usersRepository.findByEmail(email);
    }
}
