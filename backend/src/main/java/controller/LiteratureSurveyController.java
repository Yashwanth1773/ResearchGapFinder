package com.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.LiteratureSurvey;
import com.backend.service.LiteratureSurveyService;

@RestController
@RequestMapping("/survey")
public class LiteratureSurveyController {

    private final LiteratureSurveyService service;

    public LiteratureSurveyController(
            LiteratureSurveyService service) {
        this.service = service;
    }

    @GetMapping
    public LiteratureSurvey generate(
            @RequestParam String topic) {

        return service.generate(topic);
    }
}