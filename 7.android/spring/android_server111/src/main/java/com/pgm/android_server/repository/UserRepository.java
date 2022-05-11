package com.pgm.android_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgm.android_server.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
