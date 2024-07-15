package gfgbasicprograms;

import java.util.Scanner;

public class Squarerootofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		using function method
//		int num ;int ans;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter number  :");
//		num=scan.nextInt();
//		ans= (int) Math.sqrt(num);
//		System.out.println(ans);
		
//		without using function
		int num , ans=1 ,i=1;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number  :");
		num=scan.nextInt();
		if(num==0 || num==1) {
			System.out.println(num);
		}
		while(ans<=num) {
			i++;
			ans=i*i;
		}
		ans=i-1;	
		System.out.println(num + " square root is " +ans);
	}

}
