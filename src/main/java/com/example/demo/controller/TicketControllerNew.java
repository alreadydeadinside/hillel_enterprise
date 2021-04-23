package com.example.demo.controller;

import com.example.demo.entity.Ticket;
import com.example.demo.services.TicketService;
import com.example.demo.services.TicketServiceNew;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abstract/ticket")
public class TicketControllerNew extends AbstractController<Ticket, TicketServiceNew> {
    public TicketControllerNew(TicketServiceNew service) {
        super(service);
    }
}
