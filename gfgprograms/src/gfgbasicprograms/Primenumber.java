package gfgbasicprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,ans=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number :");
		num=scan.nextInt();
		if(isprime(num)) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is Not prime number");
		}
	}
	public static boolean isprime(int N) {
		if(N==0 || N==1) {
			return false;
		}
		for(int i=2;i<N;i++) {
			if(N%i==0) {
				return false;
			}
		}
		return true;
	}

}
