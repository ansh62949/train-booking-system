package com.train.booking.com.train.booking.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password; // Store hashed password
    private String role; // e.g., USER, ADMIN


}

