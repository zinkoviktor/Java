package carddeck;

public class Game {

	public static void main(String[] args) {
		Desk game = new Desk();
		game.order();
		game.shuffle();
		System.out.println(game.drawOne().getSuit().getName());		
	
		

	}

}
