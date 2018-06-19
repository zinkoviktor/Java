package Anagrams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Anagrams {

	public static void main(String[] args) {		
		String a = args[0];
		String b = args[1];
		
		
		char [] c = a.toCharArray();
		char [] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		a = new String (c);
		b = new String (d);
		
		if(a.indexOf(b)==0) {
			System.out.println("Those words is Anagrams!");
		}
		else {
			System.out.println("Those words not Anagrams!");
		}
		
	}

}
