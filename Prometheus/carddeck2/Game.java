package carddeck2;

public class Game {

	public static void main(String[] args) {
		Desk game = new Desk();
		game.order();
		game.shuffle();
		Card print = game.drawOne();
		System.out.println(print.getSuit().getName()+" "+print.getRank().getName());
	}

}
