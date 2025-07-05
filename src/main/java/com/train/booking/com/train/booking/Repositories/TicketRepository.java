package com.train.booking.com.train.booking.Repositories;



import com.train.booking.com.train.booking.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}

