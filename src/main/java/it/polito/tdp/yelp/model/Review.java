package it.polito.tdp.yelp.model;

import java.time.LocalDate;

public class Review {
	private String reviewId;
	private String businessId;
	private String userId;
	private double stars;
	private LocalDate date;
	private int votesFunny;
	private int votesUseful;
	private int votesCool;
	private String reviewText;
	
	public Review(String reviewId, String businessId, String userId, double stars, LocalDate date, int votesFunny,
			int votesUseful, int votesCool, String reviewText) {
		super();
		this.reviewId = reviewId;
		this.businessId = businessId;
		this.userId = userId;
		this.stars = stars;
		this.date = date;
		this.votesFunny = votesFunny;
		this.votesUseful = votesUseful;
		this.votesCool = votesCool;
		this.reviewText = reviewText;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getStars() {
		return stars;
	}

	public void setStars(double stars) {
		this.stars = stars;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getVotesFunny() {
		return votesFunny;
	}

	public void setVotesFunny(int votesFunny) {
		this.votesFunny = votesFunny;
	}

	public int getVotesUseful() {
		return votesUseful;
	}

	public void setVotesUseful(int votesUseful) {
		this.votesUseful = votesUseful;
	}

	public int getVotesCool() {
		return votesCool;
	}

	public void setVotesCool(int votesCool) {
		this.votesCool = votesCool;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reviewId == null) ? 0 : reviewId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (reviewId == null) {
			if (other.reviewId != null)
				return false;
		} else if (!reviewId.equals(other.reviewId))
			return false;
		return true;
	}

	
}
