package carddeck2;

enum Suit {
	HEARTS("HEARTS"),DIAMONDS("DIAMONDS"),CLUBS("CLUBS"),SPADES("SPADES");
	
	public static Suit[] values = { HEARTS, DIAMONDS, CLUBS, SPADES};
	
	private String name;

	Suit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
