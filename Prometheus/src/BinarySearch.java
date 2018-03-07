
public class BinarySearch {

	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 60;
		int length = data.length-1;
		int tmpLength = length/2;
		int i=0;
		
		if (numberToFind>data[length]) {
			System.out.println(-1);
		} else {
			while(!(data[tmpLength]==numberToFind)) {
				tmpLength=length/2;
					
				if(data[tmpLength]>numberToFind) {
					length=length-tmpLength;
				}
				else if (data[tmpLength]<numberToFind) {
					length=length+tmpLength;
				}
				else {
					;
				}
				i++;
					
			}
			System.out.println(length/2);
		}
		
		
		System.out.println("Iterations - " + i);
	}

}
