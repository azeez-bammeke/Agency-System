package com.agency.agencyapp.controller;

import com.agency.agencyapp.model.GeneralAgent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;


@RestController
@RequestMapping("/api/v1")
@Slf4j
public class AgencyController {

    @GetMapping("/agents/{searchText}")
    public ResponseEntity<List<GeneralAgent>> getAgents(@PathVariable("searchText") String searchText) {
        log.info("Search Term for agent: {}", searchText);
        List<GeneralAgent> generalAgentList = asList(
                new GeneralAgent(001l, "ABC Agent 001", "Retail", "available"),
                new GeneralAgent(002l, "ABC Agent 002", "Finance", "available"),
                new GeneralAgent(003l, "ABC Agent 003", "Retail", "available"),
                new GeneralAgent(004l, "ABC Agent 004", "Finance", "available"),
                new GeneralAgent(005l, "ABC Agent 005", "Real Estate", "available"));
        return  ResponseEntity.status(HttpStatus.OK)
                .body(generalAgentList);

    }

    @GetMapping("/works")
    public String itesdsds() {
        return  "This works";

    }
}
