package fibonacci;

public class run {

	public static void main(String[] args) {
		int a = 1;
		int b = 12;

		for(int i = a; i<=b;i++){
			long rez = Fibonacci.getNumber(i);
			if ((rez%2)==0) {
		System.out.println(rez);
			}
		}		

	}

}
