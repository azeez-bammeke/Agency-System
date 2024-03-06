package com.agency.agencyapp.controller;

import com.agency.agencyapp.model.GeneralAgent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static java.util.Arrays.asList;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(AgencyController.class)
@AutoConfigureMockMvc
public class AgencyControllerTest {

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    void setup() {
        // before each code
    }

    @Test
    void getAgents_should_return_list_of_agent() throws Exception {
        List<GeneralAgent> generalAgentList = asList(
                new GeneralAgent(001, "ABC Agent 001", "Retail", "available"),
                new GeneralAgent(002, "ABC Agent 002", "Finance", "available"),
                new GeneralAgent(003, "ABC Agent 003", "Retail", "available"),
                new GeneralAgent(004, "ABC Agent 004", "Finance", "available"),
                new GeneralAgent(004, "ABC Agent 005", "Real Estate", "available"));

        mockMvc.perform(get("/api/v1/agents/searchTerm"))
                .andExpect(status().isOk());
                //.andExpect(content().json(new ObjectMapper().writeValueAsString(generalAgentList));

    }

}

