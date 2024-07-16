package gfgbasicprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,ans = 1;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number  :");
		num=scan.nextInt();
		for(int i=1;i<=num;i++){
			ans*=i;
		}
		System.out.println("The Factorial is " +ans);
	}

}
