package edu.umb.cs.cs680;
public class Permutation {
	
public static int factorial(int n){
	if(n == 0){
		return 1;
	}
	else{
		return n*factorial(n-1);
	}
}
public static int countDivisior(int n){
	int count = 0;
	for(int i =1; i<=Math.sqrt(n);i++){
		if(n%i==0){
			count++;
			if(n/i != i){
				count++;
			}
		}
	}
	return count;
}
 public static void main(String[] args) {
	 System.out.println(countDivisior(factorial(4)));
}
	
	
}
