package com.rvmagrini.springbootapi.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// This interface is responsible for Data Access
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// SELECT * FROM dbNAme WHERE email = ...
	@Query("SELECT s FROM User s WHERE s.email = ?1")
	Optional<User> findUserByEmail(String email);

}
