package com.ccj.springboot09_jpa.repository;

import com.ccj.springboot09_jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {



}
