package com.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GapDetectionService {

    public List<String> detectGaps(String text) {

        List<String> gaps = new ArrayList<>();

        String lower = text.toLowerCase();

        if(lower.contains("future work"))
            gaps.add("Future Work Mentioned");

        if(lower.contains("limited to"))
            gaps.add("Dataset Limitation");

        if(lower.contains("only evaluated"))
            gaps.add("Evaluation Limitation");

        if(lower.contains("further research"))
            gaps.add("Further Research Needed");

        return gaps;
    }
}