package com.movie.rating.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.rating.service.bean.UserRatings;
import com.movie.rating.service.dao.RatingService;

@RestController
@RequestMapping(value="/movie/rating")
public class MovieRatingController {
	
	@Autowired(required=true)
	private RatingService ratingService;
	
	@GetMapping(value="/user/rating/{userId}")
	public ResponseEntity<UserRatings> getUserRatings(@PathVariable("userId") Long userId) {
		if(userId<=0) {
			return new ResponseEntity<UserRatings>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<UserRatings>(ratingService.findUserRating(userId), HttpStatus.OK);
	}
}
