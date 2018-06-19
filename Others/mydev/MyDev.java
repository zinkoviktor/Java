/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydev;

import java.util.Arrays;

/**
 *
 * @author Зінько
 */
public class MyDev {
        
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 = {2,3,4,5,6,12,1234,876,-1};
        minInt(arr1);
        maxInt(arr1);
        System.out.println("Arrays => "+Arrays.toString(arr1));
        fibo(5);
        fac(5);
        
    }
    
    //functions which calculate and print Minimun and Maximum value of Integer array
    public static void minInt(int[] arrList){
        int[] arr = Arrays.copyOf(arrList, arrList.length);
        int temp;
        int arrLength = arr.length-1;
        for(int i=0; i<arrLength;i++){
            if(arr[i]<arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("Min = "+arr[arrLength]);        
    }
    public static void maxInt(int[] arrList){
        int[] arr = Arrays.copyOf(arrList, arrList.length);
        int temp;
        int arrLength = arr.length-1;
        for(int i=0; i<arrLength;i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("Max = "+arr[arrLength]);
    }
    
    //function which generate and print of Fibonacci number by position 
    public static void fibo(int number){
        class FiboPrint{
            int run(int num){
            if (num==1||num==2){
                return 1;
            }
            
            return run(num-2)+run(num-1);
            }  
        }
    FiboPrint print = new FiboPrint();
    System.out.println("Number by "+number+" Fibonacci position: "+print.run(number));
    }
    //function which generate and print Factorial! 
    public static void fac(long number){
        class FacPrint{
            long run(long n){   
                if(n==1){                   
                    return 1;
                }else if(n==2){                    
                    return 2;
                }               
                return run(n-1)*n;              
            }
        }
        FacPrint fac = new FacPrint();
        System.out.println("!"+number+" = "+fac.run(number));
    }
}