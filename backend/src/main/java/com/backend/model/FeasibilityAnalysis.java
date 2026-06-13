package com.backend.model;

public class FeasibilityAnalysis {

    private String projectTitle;
    private String difficulty;
    private String duration;
    private String teamSize;
    private String datasetRequired;
    private String techComplexity;

    public FeasibilityAnalysis(
            String projectTitle,
            String difficulty,
            String duration,
            String teamSize,
            String datasetRequired,
            String techComplexity) {

        this.projectTitle = projectTitle;
        this.difficulty = difficulty;
        this.duration = duration;
        this.teamSize = teamSize;
        this.datasetRequired = datasetRequired;
        this.techComplexity = techComplexity;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDuration() {
        return duration;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public String getDatasetRequired() {
        return datasetRequired;
    }

    public String getTechComplexity() {
        return techComplexity;
    }
}