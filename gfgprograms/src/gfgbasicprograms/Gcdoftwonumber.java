package gfgbasicprograms;

import java.util.Scanner;

public class Gcdoftwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd=0;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter first number :");
		int a =scan.nextInt();
		System.out.println("Enter second number :");
		int b =scan.nextInt();
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {     // check greatest among common divide number
			System.out.println("Commonly divided number "+ i);
				gcd=i;              //declare the  greatest among common divide number to gcd variable
			}
		}
		System.out.println("Among the commonly divided number in greatest number is "+ gcd);
		
	}
	
}
