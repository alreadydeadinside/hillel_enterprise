package com.example.demo.services;

import com.example.demo.entity.Ticket;
import com.example.demo.repository.TicketRepositoryNew;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@Slf4j
public class TicketServiceNew extends AbstractService<Ticket, TicketRepositoryNew> {
    public TicketServiceNew(TicketRepositoryNew repository) {
        super(repository);
    }

    @Override
    public Optional<Ticket> save(Ticket entity) {
        log.info("UserService.save() invoked");
        return Optional.of(repository.save(entity));
    }
}

