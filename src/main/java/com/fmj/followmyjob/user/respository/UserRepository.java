package com.fmj.followmyjob.user.respository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.fmj.followmyjob.user.entity.User;

public interface UserRepository extends CrudRepository<User, UUID> {
    Optional<User> findUserByNameIgnoreCase(String name);
}
