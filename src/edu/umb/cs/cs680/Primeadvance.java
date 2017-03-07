package edu.umb.cs.cs680;

public class Primeadvance {
	
public static void sieve(int N){
	boolean[] prime = new boolean[N];
	for(int i = 0;i<N;i++){
		prime[i] = true;
	}
	prime[0] = false;
	prime[1] = false;
	
	for(int i = 0;i<N;i++){
		if(prime[i]){
			for(int j = i*i;j<N;j++){
				if(j % i == 0){
					prime[j] = false;
				}
			}
		}
	}
	
	for(int i = 0;i<N;i++){
		if(prime[i]){
			System.out.println(i);
		}
		
	}
}
public static void main(String[] args) {
	
	sieve(10);
}
}
