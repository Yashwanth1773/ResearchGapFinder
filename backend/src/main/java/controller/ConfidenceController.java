package com.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.GapConfidence;
import com.backend.service.ConfidenceService;

@RestController
@RequestMapping("/confidence")
public class ConfidenceController {

    private final ConfidenceService confidenceService;

    public ConfidenceController(
            ConfidenceService confidenceService) {

        this.confidenceService = confidenceService;
    }

    @GetMapping
    public GapConfidence getConfidence() {
        return confidenceService.calculate();
    }
}