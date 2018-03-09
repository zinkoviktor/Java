package demo;

public class MatrixPrint {

	public static void main(String[] args) {
		int size = 5;
		int x = 1;
		int z1 = 0;
		int z2 = size-1;
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				if (j==z1) { 
					System.out.print(" "+"*"+" ");
					
				}
				else if (j==z2) {
					System.out.print(" "+"*"+" ");
					
				}
				else if (x>=10) System.out.print(x+" ");
				else System.out.print(" "+x+" ");
				x++;
			}
			z1++;
			z2--;
			System.out.println();
		}

	}

}
