package classAndObjects;
public class TeamAndPlayers {

	public static void main(String[] args) {
		Player p1=new Player("Dhoni",7,1);
		Player p2=new Player("Raina",3,2);
		Player p3=new Player("Jadeja",9,3);
		
		Player [] arr=new Player[3];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		Team t1=new Team("CSK",10,"BRAVO",arr);
		
		t1.printDetails();

	}

}
