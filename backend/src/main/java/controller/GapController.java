package com.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.service.GapDetectionService;

@RestController
@RequestMapping("/gap")
public class GapController {

    private final GapDetectionService gapService;

    public GapController(GapDetectionService gapService) {
        this.gapService = gapService;
    }

    @PostMapping("/detect")
    public List<String> detectGap(@RequestBody String text) {
        return gapService.detectGaps(text);
    }
}