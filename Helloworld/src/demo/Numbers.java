package demo;

public class Numbers {

	
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x++%5);
		System.out.println(++x%5);
		if (x<10) x=5;
		else if (x<=5) x=2;
		else x=0;
		
		System.out.println("Result: "+x);
		switch(x) {
		case 5:
			System.out.println("Five");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Zero");
			break;
		}
		for (;x<20;x++) {
			x+=2;
			if (x==13)continue;
			System.out.println(x);
				}
		String a = "5";
		System.out.println(a + 5);
		
		
		
		
	}

}
