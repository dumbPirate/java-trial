package cfl.map.hashmap;

public class ScoreCard 
{
	private int matches;
	private int won;
	private int loss;
	private int points;
	
	public ScoreCard() 
	{
		
	}

	public ScoreCard(int matches, int won, int loss, int points)
	{
		
		this.matches = matches;
		this.won = won;
		this.loss = loss;
		this.points = points;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return matches + "\t\t" + won + "\t\t" + loss + "\t\t" + points;
	}
	
	
	
}
