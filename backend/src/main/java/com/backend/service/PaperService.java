package com.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.entity.Paper;
import com.backend.repository.PaperRepository;

@Service
public class PaperService {

    private final PaperRepository paperRepository;

    public PaperService(PaperRepository paperRepository) {
        this.paperRepository = paperRepository;
    }

    public List<Paper> getAllPapers() {
        return paperRepository.findAll();
    }

    public Paper savePaper(Paper paper) {
        return paperRepository.save(paper);
    }
}