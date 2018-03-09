package carddeck2;

enum Rank {
	ACE("Ace"),KING("King"),QUEEN("Queen"),JACK("Jack"),TEN("10"),NINE("9"),EIGHT("8"),SEVEN("7"),SIX("6");

	public static Rank[] values = { ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX };

	private String name;

	Rank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
