package edu.umb.cs.cs680;

import java.util.Random;

public class Insertshort {
	
	
	public static int[] randomArrayGenerator(int N){
		int[] arr = new int[N];
		for(int i = 0;i<N;i++)
		{
			Random r = new Random();
			int Low = 1;
			int High =N;
			int Result = r.nextInt(High-Low) + Low;
			arr[i] = Result;
		}		
		
		return arr;
	}
	public static void swap(int[] a ,int b,int c){
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
		
	}
	
	public static void iSort(int[] array1){
		for(int i =1;i<array1.length;i++){
			int unsorted = i;
			
			while(unsorted > 0 && array1[unsorted] < array1[unsorted-1]){
				
				swap(array1,unsorted,unsorted-1);
				unsorted = unsorted -1;
			}
			
		}
	}
	
	public static void bSort(int[] array1){
		boolean isUnsorted = true;
		int count = 0;
		while(isUnsorted){
			isUnsorted = false;
			for(int i = 0 ;i<array1.length-1;i++){
				if(array1[i]>array1[i+1]){
					int temp = array1[i];
					array1[i] = array1[i + 1];
					array1[i+1] = temp;
					isUnsorted = true;
				}
				
			}
			
		}
		
	}
	
	public static void bubbleSort(int[] array1){
		
	for(int j = 0; j<array1.length;j++){
		for(int i = 0 ;i<array1.length-1;i++){
			if(array1[i]>array1[i+1]){
				int temp = array1[i];
				array1[i] = array1[i + 1];
				array1[i+1] = temp;
				
			}
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int increment = 20000;

		// The number of steps to run.  
		// You can play around with this.
		int numSteps = 20;
		
		// THe number of characters to start with. 
		// You can play around with this.
		int start = 50000;
		
		// TODO: Fill in the rest of this method so that it runs two loops
		// and prints out timing results as described in the assignment 
		// instructions and following the pseudocode below.
		
		System.out.print("numToCheck \t");
		System.out.print("insert short \t");
		System.out.print("bubble short \t");
		System.out.print("\n");
		for (int numToCheck = start; numToCheck < numSteps*increment + start; 
				numToCheck += increment)
		{
		int[] array1 = randomArrayGenerator(numToCheck);
		
		System.out.print(numToCheck+ "\t");
		long startTime = System.nanoTime();
		iSort(array1);
		long endTime = System.nanoTime();
		double diff =(endTime - startTime)/(100000000.0);
		
		System.out.print(diff + "\t");
		long startTimeb = System.nanoTime();
		bubbleSort(array1);
		long endTimeb = System.nanoTime();
		double diffb =(endTimeb - startTimeb)/(100000000.0);
		
		System.out.println(diffb);
		}	
		
		
	}

}
