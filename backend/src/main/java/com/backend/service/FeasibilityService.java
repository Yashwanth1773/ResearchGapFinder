package com.backend.service;

import org.springframework.stereotype.Service;

import com.backend.model.FeasibilityAnalysis;

@Service
public class FeasibilityService {

    public FeasibilityAnalysis analyze(String title) {

        return new FeasibilityAnalysis(
                title,
                "Medium",
                "6-8 Weeks",
                "2 Members",
                "Yes",
                "Medium"
        );
    }
}