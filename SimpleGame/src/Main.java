
public class Main {

	public static void main(String[] args) {
		Player1 player1 = new Player1("Neeraj", "AK47", 100);
		Player2 player2 = new Player2("Kumaar", "Kar98", 100, false);
		Player2 player = new Player2("Kumaar", "Kar98", 100, true);
//		player1.damageByGun1();
//		player1.damageByGun1();
//		player1.damageByGun2();
		
		player2.damageByGun1();
		player.damageByGun1();
		player2.damageByGun2();

	}

}
