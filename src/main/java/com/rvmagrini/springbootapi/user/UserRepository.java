package com.rvmagrini.springbootapi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This interface is responsible for Data Access
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
