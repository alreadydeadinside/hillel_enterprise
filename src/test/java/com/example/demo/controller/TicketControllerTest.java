package com.example.demo.controller;

import com.example.demo.repository.AbstractRespository;
import com.example.demo.services.TicketService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(TicketController.class)
public class TicketControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    AbstractRespository abstractRespository;

    @MockBean
    TicketService ticketService;

    @Test
    public void testController() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .get("/ticket")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
