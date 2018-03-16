package RLE;

public class RLE {	
	//static StringBuilder print;
public static void main(String[] args) {
	
	if (args == null || args[0].isEmpty()) {
		System.out.println("");
	} else {
		StringBuilder string = new StringBuilder(args[0].toString());
		StringBuilder temp= new StringBuilder("");
		string.append(' ');
		int count = 0;
		int next = 0;
		
		for(int i=0;i<string.length()-1;i++) {		
			if (string.charAt(i)==string.charAt(i+1)) {			
				count++;				
				if(count==9) {	
					temp.append(string.charAt(i));
					temp.append(count);					
					count=0;								
				}
				
			}			
			else {		
				count++;
				temp.append(string.charAt(i));
				if(count>1) {
				temp.append(count);
				}				
				count=0;
			}			
		}		
        string=temp;
        System.out.println(string);
        
	}
	}
		
}
