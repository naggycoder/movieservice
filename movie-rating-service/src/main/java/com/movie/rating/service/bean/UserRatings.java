package com.movie.rating.service.bean;

import java.util.ArrayList;
import java.util.List;

public class UserRatings {
	List<Rating> userRatings = new ArrayList<>();

	public List<Rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}
	
	public List<Rating> loadUserRating(Rating rating){
		getUserRatings().add(rating);
		return getUserRatings();
	}
}
