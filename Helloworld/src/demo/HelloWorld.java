package demo;

public class HelloWorld {

	static int numberVar;
	static char characterVar;
	
	public static void main(String[] args) {
		long testVar = 0xFFFFFFFFFL;
		String sayHello = "Hello!";
		System.out.println("Hello World!");
		System.out.println("My name Victor");
		System.out.println(testVar);
		System.out.println(sayHello.toUpperCase()+characterVar+numberVar);
		int [] nArr = new int[10];
		nArr[0] = 2;
		nArr[5] = 5;
		System.out.println(nArr.length);
		int [][] doubleArr = new int[2][];
		doubleArr[0] = new int[4];
		doubleArr[0][2] = 10+5;
		System.out.println(doubleArr[0][2]);
		

	}

}
