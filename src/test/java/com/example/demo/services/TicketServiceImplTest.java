package com.example.demo.services;

import com.example.demo.entity.Ticket;
import com.example.demo.entity.TicketType;
import com.example.demo.repository.TicketRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@Slf4j
@SpringBootTest()
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class TicketServiceImplTest {

    @Mock
    TicketRepository mockTicketRepo;

    @InjectMocks
    @Autowired
    TicketServiceImpl ticketService;

    Ticket testTicket =
            new Ticket("1", "2", "3", "3",
                    "4", "5", 6.0, 7.0,
                    new Date(System.currentTimeMillis()), TicketType.SUB_TASK);

    @Test
    public void serviseTest() {
        when(mockTicketRepo.getById(eq(2L))).thenReturn(testTicket);

        Assertions.assertEquals(testTicket, ticketService.getById(2L));
    }
}