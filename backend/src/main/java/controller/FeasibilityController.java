package com.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.FeasibilityAnalysis;
import com.backend.service.FeasibilityService;

@RestController
@RequestMapping("/feasibility")
public class FeasibilityController {

    private final FeasibilityService service;

    public FeasibilityController(
            FeasibilityService service) {
        this.service = service;
    }

    @GetMapping
    public FeasibilityAnalysis analyze(
            @RequestParam String title) {

        return service.analyze(title);
    }
}