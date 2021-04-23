package com.example.demo.controller;

import com.example.demo.entity.Ticket;
import com.example.demo.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/{id}")
    public ResponseEntity <Ticket> getById(@PathVariable Long id) {

        Ticket ticket = ticketService.getById(id);
        if (ticket == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ticket);
        }    }

    @GetMapping()
    public List<Ticket> getAllTickets() {

        return ticketService.getAllTickets();
    }

    @PostMapping
    public void create(@RequestBody Ticket ticket) {
        ticketService.create(ticket);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {
        ticketService.delete(id);
    }
}
