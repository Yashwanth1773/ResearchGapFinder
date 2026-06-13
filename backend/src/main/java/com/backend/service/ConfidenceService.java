package com.backend.service;

import org.springframework.stereotype.Service;

import com.backend.model.GapConfidence;

@Service
public class ConfidenceService {

    public GapConfidence calculate() {

        int totalPapers = 10;
        int supportingPapers = 8;

        double confidence =
                ((double) supportingPapers / totalPapers) * 100;

        return new GapConfidence(
                "Multilingual Evaluation Missing",
                confidence,
                supportingPapers
        );
    }
}