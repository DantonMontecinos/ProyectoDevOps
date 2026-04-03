package com.proyecto.prueba.proyecto.service;

import com.proyecto.prueba.proyecto.entity.Ticket;
import com.proyecto.prueba.proyecto.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository repository;

    public TicketService (TicketRepository repository){
        this.repository = repository;
    }

    public Ticket crear(Ticket ticket){
        return repository.save(ticket);

    }
    public List<Ticket> listar(){
        return repository.findAll();
    }

    public Ticket obtener(Long id){
        return repository.findById(id).orElseThrow();
    }

}
