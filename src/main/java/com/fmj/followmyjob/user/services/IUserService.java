package com.fmj.followmyjob.user.services;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

import com.fmj.followmyjob.user.entity.User;

public interface IUserService {
    List<User> findAll();

    Optional<User> findById(UUID userId);

    boolean existsById(UUID userId);

    void save(User user);

    void deleteById(UUID userId);

    Optional<User> findByName(String name);
}
