package com.movie.rating.service.dao.impl;

import org.springframework.stereotype.Service;

import com.movie.rating.service.bean.Rating;
import com.movie.rating.service.bean.UserRatings;
import com.movie.rating.service.dao.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Override
	public UserRatings findUserRating(Long userId) {
		
		UserRatings userRatings = new UserRatings();
		
		Rating rating = new Rating();
		rating.setUserId(userId);
		rating.setMovieId(1L);
		rating.setRating(3.3);
		rating.setComments("Average movie");
		
		Rating rating1 = new Rating();
		rating1.setUserId(userId);
		rating1.setMovieId(2L);
		rating1.setRating(4.5);
		rating1.setComments("Awesome movie");
		
		Rating rating2 = new Rating();
		rating2.setUserId(userId);
		rating2.setMovieId(3L);
		rating2.setRating(2.0);
		rating2.setComments("Bad movie");
		
		userRatings.loadUserRating(rating);
		userRatings.loadUserRating(rating1);
		userRatings.loadUserRating(rating2);
		
		return userRatings;
		
	}

}
