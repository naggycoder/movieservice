package com.movie.info.service.dao;

import com.movie.info.service.bean.MovieInfo;
import com.movie.info.service.dao.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieDataTest implements Movie {

    @Override
    public MovieInfo getMovieInfo(Integer movieId) {
        return new MovieInfo(movieId, "movie_name", "movie_description", "release_date", "create_date", "update_date") ;
    }
    public Movie getInstance(){
        return this;
    }
}
