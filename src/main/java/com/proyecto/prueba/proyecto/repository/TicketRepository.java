package com.proyecto.prueba.proyecto.repository;

import com.proyecto.prueba.proyecto.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository  extends JpaRepository<Ticket, Long> {
}
