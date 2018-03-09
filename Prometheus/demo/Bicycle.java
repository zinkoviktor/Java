package demo;

public class Bicycle {
	
	private static int numberOfBisycle = 0;
	private int id;
	
	
	public Bicycle() {		
		id = ++numberOfBisycle;
	}
	
	public int getID() {
		 return id;
	}

	
	
	
}
