package com.train.booking.com.train.booking.Repositories;



import com.train.booking.com.train.booking.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Optional: To check if a username already exists
}

