package com.backend.model;

public class LiteratureSurvey {

    private String topic;
    private String survey;

    public LiteratureSurvey(String topic,
                            String survey) {
        this.topic = topic;
        this.survey = survey;
    }

    public String getTopic() {
        return topic;
    }

    public String getSurvey() {
        return survey;
    }
}