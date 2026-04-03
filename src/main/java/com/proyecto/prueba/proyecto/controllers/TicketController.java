package com.proyecto.prueba.proyecto.controllers;


import com.proyecto.prueba.proyecto.entity.Ticket;
import com.proyecto.prueba.proyecto.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @PostMapping
    public Ticket crear(@RequestBody Ticket ticket){
        return service.crear(ticket);
    }

    @GetMapping
    public List<Ticket> listar(){
        return service.listar();
    }

    public Ticket obtener(@PathVariable Long id){
        return service.obtener(id);
    }
}
