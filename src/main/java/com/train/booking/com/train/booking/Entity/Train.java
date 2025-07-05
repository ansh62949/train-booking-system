package com.train.booking.com.train.booking.Entity;



import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String trainName;
    private String source;
    private String destination;
    private String schedule; // You can use LocalDate or String based on your needs
}

