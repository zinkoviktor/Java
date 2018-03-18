package RLEDecoder;

public class RLEDecoder {

	public static void main(String[] args) {
		if (args == null || args[0].isEmpty()) {
			System.out.println("");
		} else {
			StringBuilder string = new StringBuilder(args[0].toString());
			StringBuilder temp= new StringBuilder("");
			string.append(' ');
			int j='1';
			end: for(int i=0;i<string.length()-1;i++) {				
				if(string.charAt(i)==string.charAt(i+1)) {
					System.out.println("");
					temp.delete(0, temp.length());
					temp.append("");
					break end;
				}
				else if(string.charAt(0)>='0'&&string.charAt(0)<='9') {
					System.out.println("");
					temp.delete(0, temp.length());
					temp.append("");
					break end;
				}
				else if((string.charAt(i)>='0'&&string.charAt(i)<='9')&&(string.charAt(i+1)>='0'&&string.charAt(i+1)<='9')) {
					System.out.println("");
					temp.delete(0, temp.length());	
					temp.append("");
					break end;
				}
				else if(string.charAt(i)=='0'||string.charAt(i)=='1') {
					System.out.println("");
					temp.delete(0, temp.length());	
					temp.append("");
					break end;
				}
				else if(string.charAt(i+1)>'1'&&string.charAt(i+1)<='9') {
					while(string.charAt(i+1)>=j) {
						temp.append(string.charAt(i));
						j++;
					}					
					j='1';
					i++;
				}
				else {
					temp.append(string.charAt(i));
				}
			}
			string=temp;
			System.out.println(string);
		}

	}

}
