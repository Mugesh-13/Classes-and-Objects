package classAndObjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String teamName;
	private int teamCount;
	private String coachName;
	private List<Player> playerList=new ArrayList<>();
	
	Team(String teamName,int teamCount,String coachName,Player [] details){
		this.teamName=teamName;
		this.teamCount=teamCount;
		this.coachName=coachName;
		for(Player i :details) {
			playerList.add(i);
		}
	}
	void printDetails() {
		System.out.println("TEAM NAME :-" +teamName);
		System.out.println("TEAM SIZE :-" +teamCount);
		System.out.println("COACH :-"+coachName);
		for(Player i:playerList)
		{
			System.out.println(i);
		}
	}
}
