package com.fmj.followmyjob.user.respository;

import com.fmj.followmyjob.user.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
