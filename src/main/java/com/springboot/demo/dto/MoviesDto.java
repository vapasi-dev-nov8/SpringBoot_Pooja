package com.springboot.demo.dto;

public class MoviesDto {

    private String title;
    private String actorName;
    private String directorName;

    public MoviesDto(String title, String actorName, String directorName) {
        this.title = title;
        this.actorName = actorName;
        this.directorName = directorName;
    }

    public String getTitle(){
        return title;
    }

    public String getActorName(){
        return actorName;
    }
    public String getDirectorName(){
        return directorName;
    }
}
