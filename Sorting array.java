package Array;

import java.util.Arrays;
import java.util.Scanner;

class FindMinMax {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		long n=sc.nextInt();
		long[] arr= new long[(int)n];
		
		System.out.println("Enter the array");
		for (int m= 0; m < arr.length; m++) {
			arr[m]=sc.nextInt();
		}
		
		long Maxans=getMax(arr,n);
		System.out.println(" the maximum value = " +getMax(arr,n));
		
		long Minans=getMin(arr,n);
		System.out.println(" the minimum value = " +getMin(arr,n));
	
		}
  static long getMax(long a[],long n)  
	    {
	        long maxvalue=a[0];
	       
	        for(int i=0;i<a.length;i++){
	         
	               if(maxvalue<a[i])
	                 maxvalue=a[i];
	           }
	         return maxvalue;
	    }
  static long getMin(long a[],long n)  
	    {
	       
	        long minvalue=a[0];
	        for(int i=0;i<a.length;i++){
	         
	               if(minvalue>a[i])
	                  minvalue=a[i];
	           }
	         return minvalue;
	    }
	}

