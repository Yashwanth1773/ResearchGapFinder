package com.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.model.ProjectRecommendation;

@Service
public class RecommendationService {

    public List<ProjectRecommendation> recommend(String gap) {

        List<ProjectRecommendation> projects =
                new ArrayList<>();

        if(gap.toLowerCase().contains("multilingual")) {

            projects.add(
                new ProjectRecommendation(
                    "Telugu Research Paper Analyzer",
                    "Medium",
                    "React, Spring Boot, Python"
                )
            );

            projects.add(
                new ProjectRecommendation(
                    "Cross-Language Research Assistant",
                    "High",
                    "React, Java, NLP"
                )
            );
        }

        return projects;
    }
}