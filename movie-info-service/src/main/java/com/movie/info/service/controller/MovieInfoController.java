package com.movie.info.service.controller;

import com.movie.info.service.bean.MovieInfo;
import com.movie.info.service.dao.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movie/info")
public class MovieInfoController {

    @Autowired
    private Movie moveInfo;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<String>("Test movie info..", HttpStatus.OK);
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieInfo> getMovieId(@PathVariable("movieId") Integer movieId){
        return new ResponseEntity<MovieInfo>(moveInfo.getMovieInfo(movieId), HttpStatus.OK);
    }

}