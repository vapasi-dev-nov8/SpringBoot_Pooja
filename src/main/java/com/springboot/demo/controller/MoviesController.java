package com.springboot.demo.controller;

import com.springboot.demo.dto.MoviesDto;
import com.springboot.demo.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {

    private MoviesService moviesService;

    @Autowired
    public MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("/")
    public ResponseEntity<List<MoviesDto>> getAllMovies(){
        List<MoviesDto> allMovies = moviesService.getAllMovies();
        return ResponseEntity.ok().body(allMovies);
    }

}
