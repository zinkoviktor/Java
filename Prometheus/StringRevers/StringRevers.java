package StringRevers;

public class StringRevers {

	public static void main(String[] args) {
		String str = args[0];
		char [] temp = new char[str.length()];
		int j=0;
		
		for(int i=str.length()-1;i>=0;i--) {			
			temp[j]=str.charAt(i);
			j++;
		}
		str=String.copyValueOf(temp);
		System.out.println(str);

	}

}
