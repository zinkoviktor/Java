package fibonacci;

public class Fibonacci {
		
		
    public static long getNumber(int position){
    	if (position == 1||position==2) return 1;
        else if (position>2) return getNumber(position-1)+getNumber(position-2);
        else return -1;
    }
}



	
  

