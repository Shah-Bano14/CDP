package org.com.collections;


public class Player implements Comparable<Player> {
	
	int score;
	String name;
	
	Player(int score,String name)
	{
		this.score=score;
		this.name=name;
	}
	
	public String toString()
	{
		return this.name+" "+this.score;
	}
	
	public int compareTo(Player o2) {
		if(this.score>o2.score)
		{
			return 1;
		}
		if(this.score<o2.score)
		{
			return -1;
		}
		if(this.score==o2.score)
		{
			return this.name.compareTo(o2.name);
		}
		return 0;
	}

}
