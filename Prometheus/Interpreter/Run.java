package Interpreter;

public class Run extends �alculations{

	public static void main(String[] args) {
		Context cont = new Context();
		Expression exp = cont.evaluate("1+63+6+5)+565+2");
		System.out.println(exp.interpret());

	}

	

}
