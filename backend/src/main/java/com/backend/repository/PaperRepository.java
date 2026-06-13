package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entity.Paper;

public interface PaperRepository extends JpaRepository<Paper, Long> {

}