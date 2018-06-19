package Interpreter;

public class Ñalculations {
	static class NumberExpression implements Expression{
		int number;
		public NumberExpression(int number) {
			this.number=number;
		}
		
		public int interpret() {
			return number;
		}
		
	}
	
	static class MinusExpression implements Expression{
		Expression left;
		Expression right;
		public MinusExpression(Expression left, Expression right) {
			this.left=left;
			this.right=right;			
		}
		public int interpret() {
			return left.interpret()-right.interpret();
		}
		
	}
	
	static class  PlusExpression implements Expression{
		Expression left;
		Expression right;
		public PlusExpression(Expression left, Expression right) {
			this.left=left;
			this.right=right;			
		}
		public int interpret() {
			return left.interpret()+right.interpret();
		}
		
	}
	static class  MultiplyExpression implements Expression{
		Expression left;
		Expression right;
		public MultiplyExpression(Expression left, Expression right) {
			this.left=left;
			this.right=right;			
		}
		public int interpret() {
			return left.interpret()*right.interpret();
		}
		
	}
	static class  DivideExpression implements Expression{
		Expression left;
		Expression right;
		public DivideExpression(Expression left, Expression right) {
			this.left=left;
			this.right=right;			
		}
		public int interpret() {
			try {
				return left.interpret()/right.interpret();
			}catch(ArithmeticException e) {
				System.out.println("Error" + e);
				throw new ArithmeticException();
			}			
		}
		
	}
	
	public static class Context{
		Expression evaluate (String str) {
			int pos = str.length()-1;
			while(pos>0) {
				if(Character.isDigit(str.charAt(pos))) {
					pos--;
				}	else {
						Expression left = evaluate(str.substring(0, pos));					
						Expression right = new NumberExpression(Integer.valueOf(str.substring(pos+1,str.length())));
				
						char operator = str.charAt(pos);
						switch(operator) {
						case '-': return new MinusExpression(left, right);
						case '+': return new PlusExpression(left,right);
						case '*': return new MultiplyExpression(left,right);
						case '/': return new DivideExpression(left,right);
						}
				}
				}
			
			int result = Integer.valueOf(str);
			return new NumberExpression(result);
		}
	}
}
