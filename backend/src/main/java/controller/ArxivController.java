package com.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.dto.PaperDTO;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/arxiv")
public class ArxivController {

    @GetMapping("/search")
    public String searchPapers(@RequestParam String keyword) {

        return "Searching papers for: " + keyword;
    }

    @GetMapping("/papers")
    public List<PaperDTO> getPapers() {

        List<PaperDTO> papers = new ArrayList<>();

        papers.add(
                new PaperDTO(
                        "Machine Learning in Healthcare",
                        "Predicting diseases using AI and Machine Learning techniques."
                )
        );

        papers.add(
                new PaperDTO(
                        "Deep Learning for Medical Imaging",
                        "Improving diagnosis accuracy using deep neural networks."
                )
        );

        papers.add(
                new PaperDTO(
                        "AI-Based Disease Prediction",
                        "Using predictive analytics for early disease detection."
                )
        );

        return papers;
    }
}