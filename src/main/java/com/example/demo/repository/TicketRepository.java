package com.example.demo.repository;

import com.example.demo.entity.Ticket;

import java.util.List;

public interface TicketRepository {

    Ticket getById(Long id);

    List<Ticket> getAllTickets();

    void create(Ticket ticket);

    void remove(Long id);
}
