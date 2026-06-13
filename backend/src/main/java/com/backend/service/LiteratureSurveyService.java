package com.backend.service;

import org.springframework.stereotype.Service;

import com.backend.model.LiteratureSurvey;

@Service
public class LiteratureSurveyService {

    public LiteratureSurvey generate(
            String topic) {

        String survey =
                "Several studies have explored "
                + topic
                + ". Existing research focuses "
                + "on improving performance, "
                + "accuracy, and scalability. "
                + "Researchers have proposed "
                + "various techniques, but "
                + "limitations still exist, "
                + "creating opportunities for "
                + "future research.";

        return new LiteratureSurvey(
                topic,
                survey
        );
    }
}