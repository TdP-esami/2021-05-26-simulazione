package it.polito.tdp.yelp.model;

public class User {
	private String userId;
	private int votesFunny;
	private int votesUseful;
	private int votesCool;
	private String name;
	private double averageStars;
	private int reviewCount;
	
	public User(String userId, int votesFunny, int votesUseful, int votesCool, String name, double averageStars,
			int reviewCount) {
		super();
		this.userId = userId;
		this.votesFunny = votesFunny;
		this.votesUseful = votesUseful;
		this.votesCool = votesCool;
		this.name = name;
		this.averageStars = averageStars;
		this.reviewCount = reviewCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverageStars() {
		return averageStars;
	}

	public void setAverageStars(double averageStars) {
		this.averageStars = averageStars;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		User other = (User) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	
}
