package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	String MYORDERQUERY = "FROM User";
	
	User findByEmail(String email);
	 
	 @Query(MYORDERQUERY)
	 List<User> findUsers(); 
}
