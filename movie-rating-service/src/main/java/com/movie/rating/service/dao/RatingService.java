package com.movie.rating.service.dao;

import com.movie.rating.service.bean.UserRatings;

public interface RatingService {
	UserRatings findUserRating(Long userId);
}
