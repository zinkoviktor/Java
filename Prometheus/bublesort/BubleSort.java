package bublesort;

public class BubleSort {

	public static void main(String[] args) {
		int[] array = {-11111, 4, 3, 2, 11111, 1};
		int length = array.length;
		
		int x=0;
		while(x<length-1) {
			x=0;
			for (int i = 0; i < length; i++) {
				if (i==length-1)break;
				int y = i+1;
				
				if (array[y]<array[i]) {
					int tmp  = array[i];				
					array[i] = array[y];
					array[y] = tmp;
				}
				else {
					x++;				
				}
					
			}
		
		}
		
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
