package edu.umb.cs.cs680;
import java.util.*;
public class NumberOfPrime {
	
public static int[] numberOfArray(int X){
	int length = String.valueOf(X).length();
	int[] number = new int[length];
	
	while(X>0){
		number[length-1] = X % 10;
		X = X /10;
		length--;
		
	}
	return number;
	
}
public static int makenumber(int x ,int y){
	return (x*10)+y;
}
public static void main(String[] args) {
	//System.out.println(numberOfArray(1234));
	int[] value = numberOfArray(2563);
	int count = 0;
	for(int i =0 ; i<value.length-1;i++){
		if(makenumber(value[i],value[i+1])<=26){
			count++;
		}
		
	}
	
	System.out.println(count + 1);
	
}
}
