package RPN;

import java.util.Deque;
import java.util.LinkedList;

public class RPN {
	

	public static double parse(String rpnString) {
		String [] arr = rpnString.split(" ");
		Deque<Double> list = new LinkedList<Double>();
		double a,b;
		try {		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].equals("*")||arr[i].equals("+")||arr[i].equals("/")||arr[i].equals("-")){
				
				a = list.pop();
				b = list.pop();
							
				switch (arr[i]) {
					case "*":list.push(b*a);
					break;
					case "+":list.push(b+a);
					break;					
					case "/":list.push(b/a);
					break;									
					case "-":list.push(b-a);
					break;
				}
				if(list.getLast().equals(Double.NaN)|| list.getLast().equals(Double.POSITIVE_INFINITY)||list.getLast().equals(Double.NEGATIVE_INFINITY)) {
					throw new ArithmeticException();
					}	
			}			
			else {				
					list.push(Double.parseDouble(arr[i]));								
			}	
		}	
		
		}
		catch(ArithmeticException e) {
			throw new ArithmeticException();
		}
		catch(Exception e) {
			throw new RPNParserException();
		}
		return list.getFirst();	
	}

	public static void main(String[] args) {
		//System.out.println(parse("10 20 30 () +"));
		System.out.println(parse("12 2 3 4 * 10 5 / + * +")); //40
		System.out.println(parse("12 2 -3 4 * 10 -5 / + * +")); //-16
		System.out.println(parse("10 20 + 30 40 + *")); //2100
		System.out.println(parse("10 20 30.0 * +")); //610
		//System.out.println(parse("10 20 30 () +")); //RPNParserException
		//System.out.println(parse("10 20 Å * +")); //RPNParserException
		//System.out.println(parse("0 0 /")); //ArithmeticException
		//System.out.println(parse("10 * 6 7 +")); //RPNParserException
		//System.out.println(parse("10 NaN 6 7 + - *")); //ArithmeticException
	}

}

