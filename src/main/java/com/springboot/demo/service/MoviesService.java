package com.springboot.demo.service;

import java.util.List;
import com.springboot.demo.dto.MoviesDto;
import com.springboot.demo.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService {
    private MoviesRepository moviesRepository;

    @Autowired

    public MoviesService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<MoviesDto> getAllMovies(){
        return moviesRepository.getAllMovies();
    }

}
