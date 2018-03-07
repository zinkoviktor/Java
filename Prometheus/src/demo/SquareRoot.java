package demo;

public class SquareRoot {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 99999;
		double x1=0;
		double x2=0;

		double D = ((b*b)-4*a*c);
		
		
		if (a==0&&b==0) {
			System.out.print("x1=\nx2=");
		}
		else if (a==0||b==0) {
			System.out.print("x1="+x1+"\nx2="+x2);
		}
		else if(D>0) {
			x1 = (-b + Math.sqrt(D))/(2*a);
			x2 = (-b - Math.sqrt(D))/(2*a);
			System.out.print("x1="+x1+"\nx2="+x2);
		}
		else if(D==0) {
			x1=-b/(2*a);
			x2=x1;
			System.out.print("x1="+x1+"\nx2="+x2);
		}
		
	}
	class Вітя {
		int x =5;
	}

}


