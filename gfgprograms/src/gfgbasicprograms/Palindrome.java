package gfgbasicprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,dub,rem,rev=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number  :");
		num=scan.nextInt();
		dub=num;
		while(dub>0) {
			rem=dub%10;
			rev=(rev*10)+rem;
			dub/=10;
		}
		if(rev==num) {
			System.out.println(num +" is palindrome");
		}
		else System.out.println(num +" is Not Palindrome");

	}

}
