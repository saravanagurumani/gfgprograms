package gfgbasicprograms;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter number :");
		int userin=scan.nextInt();
		oddeven(userin);		

	}

	public static void oddeven(int check) {
		 if(check==0) {
			System.out.println("Invalid");
		}
		else if(check % 2 == 0) {
			System.out.println("EVEN NUMBER");
		}
		else {
			System.out.println("ODD NUMBER");
		}
		
	}

}
