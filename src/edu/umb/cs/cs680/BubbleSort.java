package edu.umb.cs.cs680;

import java.util.ArrayList;
import java.util.HashMap;

public class BubbleSort {
	public static void main(String[] args) {
	int[] array1 = {1,2,3,4,5,6};
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
		count++;
	}
	
	for(int k = 0; k<array1.length;k++){
		System.out.println(array1[k]);
	}
	System.out.println("the count is : "+ count);
}
}
