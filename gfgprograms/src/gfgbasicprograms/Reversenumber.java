package gfgbasicprograms;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,rem;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number :");
		int num=scan.nextInt();
		while(num>0) {
			rem = num % 10;
			rev=(rev*10)+rem;
			num/=10;
		}
		System.out.println("The reverse number is : " + rev);
				
	}

}
