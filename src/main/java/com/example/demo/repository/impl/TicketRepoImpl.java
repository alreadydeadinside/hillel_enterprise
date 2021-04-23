package com.example.demo.repository.impl;

import com.example.demo.entity.Ticket;
import com.example.demo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TicketRepoImpl implements TicketRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public Ticket getById(Long id) {
        return entityManager.find(Ticket.class, id);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return entityManager.createQuery("from Ticket",
                Ticket.class).getResultList();
    }

    @Override
    public void create(Ticket ticket) {
        entityManager.persist(ticket);
    }

    @Override
  //  @Query("update Ticket t set t.status = 'DELETED' where t.id = tId")
    public void remove(Long tId) {
        Ticket ticket = entityManager.find(Ticket.class, tId);
         ticket.setStatus("DELETED");
//        entityManager
//                .createQuery("update Ticket t set t.status = 'DELETED' where t.id = tId")
//                .executeUpdate();
//          entityManager.refresh(ticket);

    }
}
