package gfgbasicprograms;

import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number :");
		int num = scan.nextInt();
		while (num != 0) {
			num /= 10;
			System.out.println(num);
			count++;
		}
		
		System.out.println("The given number digit count is " + count);
		
	}

}
