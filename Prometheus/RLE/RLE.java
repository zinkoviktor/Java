package RLE;

public class RLE {	
	//static StringBuilder print;
	public static StringBuilder RLEPrint(String str) {
		StringBuilder string = new StringBuilder(str);
		StringBuilder toLowerString = new StringBuilder(string);		
		StringBuilder temp= new StringBuilder("");
		string.append(" ");
		int count = 1;
		int next = 0;		
		for(int i=0;i<string.length()-1;i++) {		
			if (string.charAt(i)==string.charAt(i+1)) {			
				count++;				
				if(count==9) {					
					temp.append(count);
					temp.append(string.charAt(i));
					count=1;								
				}				
			}
			else {
				temp.append(count);
				temp.append(string.charAt(i));
				count=1;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		
		System.out.println(RLEPrint("hhhhhhhhhhhhggghhhhhhhhhhh"));
	}

}
