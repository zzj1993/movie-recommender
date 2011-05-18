package org.movierecommender.driver.prediction;

import java.util.List;

import org.movierecommender.driver.similarity.SimilarityResult;
import org.movierecommender.model.Item;
import org.movierecommender.model.User;

public interface RatingPredictor {

	PredictionResult predictRating(User main, Item item, List<SimilarityResult> similarity);
	
}