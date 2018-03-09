package ShellSort;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {956, 565, 830, 748, 802, 747, 826, 244, 444, 506};
		int length = array.length;
        int tmp = 0;
        int end = length/2;
        
        int k=length/2;
		//PUT YOUR CODE HERE
        while(end!=0) {
        		k=length/2;
        	for (int i=0;i<length/2;i++){
	            if (array[i]>array[k]){
	                tmp=array[i];
	                array[i]=array[k];
	                array[k]=tmp;
                }
                else {
                	--end;
                }
                k++;
            }          
        }
        end = length/2;
        while(end!=0) {
    		k=length/2;
    		for (int j=0;j<length/2;j++){
                if (array[j]>array[j+length/2]){
                tmp=array[j];
                array[j]=array[j+length/2];
                array[j+length/2]=tmp;
                }
                else {
                	--end;
                }
            }
        } 
        end = length/2;
        while(end!=0) {
    		k=length/2;
    		for (int j=0;j<length/2;j++){
                if (array[j]>array[j+length/3]){
                tmp=array[j];
                array[j]=array[j+length/3];
                array[j+length/3]=tmp;
                }            
                else {
                	--end;
                }
    		}
        }
        end = length;
        while(end!=0) {
        	for (int j=0;j<length-1;j++){
                if (array[j]>array[j+1]){
                tmp=array[j];
                array[j]=array[j+1];
                array[j+1]=tmp;
                }
                else {
                	--end;
                }
        	
        }
        }
        
		//PUT YOUR CODE HERE
	    
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
