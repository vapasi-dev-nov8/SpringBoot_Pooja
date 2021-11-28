package com.springboot.demo.repository;

import com.springboot.demo.dto.MoviesDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MoviesRepository {
    public List<MoviesDto> getAllMovies(){

        List<MoviesDto> moviesDtoList = new ArrayList<MoviesDto>();

        moviesDtoList.add(new MoviesDto("Sherlock Holmes","Robert Downey Jr.","Christopher Nolan"));
        moviesDtoList.add(new MoviesDto("Terminator 2 : Judgment Day","Arnold Schwarzenegger","James Cameron"));
        moviesDtoList.add(new MoviesDto("Jurassic Park","Sam Neill","Steven Spielberg"));
        moviesDtoList.add(new MoviesDto("A Quiet Place","Emily Blunt","John Krasinski"));

        return moviesDtoList;
    }



}
