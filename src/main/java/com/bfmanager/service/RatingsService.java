package com.bfmanager.service;

import java.util.List;

import com.bfmanager.model.hibernate.Ratings;

public interface RatingsService {
	public List<Ratings> getRatings();
	
	public void saveRating(Ratings raiting);
	
	public void updateRating(Ratings raiting);
	
	public void removeRating(Ratings raiting);
	
	public Ratings getRatingXId(Long id);
	
	public List<Ratings> getRatingNoView();
}
