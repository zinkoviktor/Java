package demo;

public class BoxDemo {

	private static Bicycle rover;

	public static void main(String[] args) {
		
		Box b1 = new Box(10, 20, 30);
		Box b2 = new Box(40, 50, 60);
		Box b3 = new Box();
		
		b1.print();
		b2.print();
		b3.print();
		
		b3.change(20, 30, 40);
		b3.print();
		System.out.println("Volume: "+b3.getVolume());
				
		Bicycle by3 = new Bicycle();
		rover = new Bicycle();
		
		
		System.out.println("Bisycle id: "+by3.getID());
	}

}
