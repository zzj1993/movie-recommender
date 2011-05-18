package org.movierecommender.driver.prediction;

import org.movierecommender.model.Item;
import org.movierecommender.model.User;

public class PredictionResult implements Comparable<PredictionResult> {

	private final User user;
	private final Item item;
	private final int value;

	public PredictionResult(User user, Item item, int value) {
		this.user = user;
		this.item = item;
		this.value = value;
	}

	@Override
	public int compareTo(PredictionResult o) {
		return (this.getValue() > o.getValue()) ? -1 : 1;
	}

	@Override
	public String toString() {
		return user + " predicted rating for " + item + " is " + getValue();
	}

	public int getValue() {
		return value;
	}
}