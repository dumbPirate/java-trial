package cfl.map.hashmap;

import java.util.*;
import java.util.Map.Entry;

public class ScoreCardMain 
{
	static Map<String, ScoreCard> m =new HashMap<String, ScoreCard>();
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		m.put("Pak", new ScoreCard(4, 0, 0, 0));
		m.put("Ind", new ScoreCard(4, 0, 0, 0));
		m.put("Aus", new ScoreCard(4, 0, 0, 0));
		m.put("Ban", new ScoreCard(4, 0, 0, 0));
		m.put("Eng", new ScoreCard(4, 0, 0, 0));
		while(true)
		{
			display();
			System.out.println("1.Play\n2.Stop");
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:play();
						break;
				case 2: System.exit(0);
				default : System.out.println("Enter valid Option");
			}
		}
	}
	
	public static void play()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Team");
		String first=sc.next();
		
		if(m.get(first).getMatches()<=0)
		{
			System.out.println("No more Matches remaining for "+first+"\n");
			return;
		}
		
		
		System.out.println("Enter the Second Team");
		String second=sc.next();
		
		if(m.get(second).getMatches()<=0)
		{
			System.out.println("No more Matches remaining for "+second+"\n");
			return;
		}
		
		System.out.println("Who won the match");
		String won=sc.next();
		
		
		
		
		
		if(first.equalsIgnoreCase(won))
		{
			ScoreCard s1=m.get(first);
			m.put(first, new ScoreCard(s1.getMatches()-1, s1.getWon()+1, s1.getLoss(), s1.getPoints()+2));
			
			ScoreCard s2 = m.get(second);
			m.put(second, new ScoreCard(s2.getMatches()-1, s2.getWon(), s2.getLoss()+1, s2.getPoints()));
		}
		else
		{
			ScoreCard s1 = m.get(second);
			m.put(second, new ScoreCard(s1.getMatches()-1, s1.getWon()+1, s1.getLoss(), s1.getPoints()+2));
			
			ScoreCard s2=m.get(first);
			m.put(first, new ScoreCard(s2.getMatches()-1, s2.getWon(), s2.getLoss()+1, s2.getPoints()));
			
			
		}
	}
	
	public static void display()
	{
		System.out.println("Team\t\tMatches\t\tWon\t\tLoss\t\tPoints");
		System.out.println("-----------------------------------------------------------------------------");
		
		Iterator<Entry<String, ScoreCard>> itr = m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, ScoreCard> e = itr.next();
			System.out.println(e.getKey() + "\t\t" + e.getValue().getMatches() + "\t\t" +e.getValue().getWon() +"\t\t" +e.getValue().getLoss() + "\t\t" +e.getValue().getPoints());
		}
		System.out.println();
	}
}
