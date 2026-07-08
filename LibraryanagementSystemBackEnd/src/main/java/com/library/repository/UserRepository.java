package com.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	 Optional<User> findByEmail(String email);
	 //optional is used to avoid null pointer exception, it is a container object which may or may not contain a non-null value. if a value is present, isPresent() will return true and get() will return the value.

	    Optional<User> findByMobile(String mobile);

	    boolean existsByEmail(String email);

	    boolean existsByMobile(String mobile);
}
