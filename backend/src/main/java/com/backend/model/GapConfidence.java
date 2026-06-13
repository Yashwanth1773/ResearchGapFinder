package com.backend.model;

public class GapConfidence {

    private String gap;
    private double confidence;
    private int evidencePapers;

    public GapConfidence(String gap,
                         double confidence,
                         int evidencePapers) {
        this.gap = gap;
        this.confidence = confidence;
        this.evidencePapers = evidencePapers;
    }

    public String getGap() {
        return gap;
    }

    public double getConfidence() {
        return confidence;
    }

    public int getEvidencePapers() {
        return evidencePapers;
    }
}