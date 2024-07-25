package gfgbasicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value,sum=0,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size  :");
		int ars=scan.nextInt();   //i will take user to enter array size
		int[] num= new int[ars];
		
	    System.out.println("Enter any " + ars + " numbers  :");
		for(int i=0; i<num.length;i++) {
			num[i]=scan.nextInt();     //i will take user input
		}
		for(int ans : num) {
			if(ans%3==0) {
				count++;
				System.out.println(ans);
			}
			sum+=ans;
		}
		System.out.println("the given number is only divided by %3 :" + count);
		System.out.println("the given number total " + sum);
		
	}

}
