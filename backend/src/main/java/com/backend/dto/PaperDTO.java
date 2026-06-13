package com.backend.dto;

public class PaperDTO {

    private String title;
    private String summary;

    public PaperDTO(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }
}