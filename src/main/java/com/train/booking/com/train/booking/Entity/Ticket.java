package com.train.booking.com.train.booking.Entity;



import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private Long userId; // Foreign key reference to User
    private Long trainId; // Foreign key reference to Train
    private String dateOfTravel;
}

