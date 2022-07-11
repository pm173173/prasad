package org.hps.code;

import java.util.Arrays;
import java.util.Scanner;

public class HighPeakCode {
	 public static int minDiff(int array[], int a, int b)
	    {
	        int result = Integer.MAX_VALUE;
	        Arrays.sort(array);
	        for (int i=0; i<= a-b;i++)
	            result = Math.min(result, array[i + b - 1] - array[i]);
	        return result;
	    }
	 public static int findelements(int res,int array[], int a, int b)
	    {
	        int result = Integer.MAX_VALUE;
	        for(int i=0; i<=a; i++)
	        {
	            result = Math.min(result, array[i + b - 1] - array[i]);
	            if (res==result)
	                return i;
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
       String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
       int len = array.length;
       System.out.print("Enter the number of employees:");
       Scanner sc = new Scanner(System.in);
       
       int M=sc.nextInt();
       int result=minDiff(array, len, M);
       System.out.println("Number of the employees:"+M);
       
       int si=findelements(result,array,len,M);
       System.out.println("Here the goodies that are selected for distribution are:");
       
       for(int i=si;i<si+M;i++)
           System.out.println(items[i]);
       System.out.println("\n");
       System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+result);
       sc.close();
	}

}


