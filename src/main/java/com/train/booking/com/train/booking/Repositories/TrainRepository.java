package com.train.booking.com.train.booking.Repositories;



import com.train.booking.com.train.booking.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}

