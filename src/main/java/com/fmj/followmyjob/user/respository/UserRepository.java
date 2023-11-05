package com.fmj.followmyjob.user.respository;

import com.fmj.followmyjob.user.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
