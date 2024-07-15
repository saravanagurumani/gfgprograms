package gfgbasicprograms;

import java.util.Scanner;

public class Perfectnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number  :");
		num=scan.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				 sum+=i;
			}
		}

		if(sum==num) {
			System.out.println(num+" is Perfect Number");
		}
		else System.out.println(num+" is Not Perfect Number");
	}

}
