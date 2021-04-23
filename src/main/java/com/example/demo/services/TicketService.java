package com.example.demo.services;

import com.example.demo.entity.Ticket;

import java.util.List;

public interface TicketService {
    Ticket getById (Long id);

    List<Ticket> getAllTickets();

    void create(Ticket ticket);

    void delete(Long id);
}
