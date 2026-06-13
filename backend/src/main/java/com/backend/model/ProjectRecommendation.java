package com.backend.model;

public class ProjectRecommendation {

    private String title;
    private String difficulty;
    private String techStack;

    public ProjectRecommendation(String title,
                                 String difficulty,
                                 String techStack) {
        this.title = title;
        this.difficulty = difficulty;
        this.techStack = techStack;
    }

    public String getTitle() {
        return title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getTechStack() {
        return techStack;
    }
}