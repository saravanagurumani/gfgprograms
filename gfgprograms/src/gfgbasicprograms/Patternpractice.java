package gfgbasicprograms;

import java.util.Scanner;

public class Patternpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter number you want to print :");
//		n=scan.nextInt();
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if((i==2 && j==3) || (i==3 && j==2 ) || (i==3 && j==4) || (i==4 && j==3) ) {
//					System.out.print(" ");
//					continue;	
//				}
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				if((i==3&&j==2)||(i==4&&j==2)||(i==4&&j==3)) {
//					System.out.print(" ");
//					continue;
//				}
//				System.out.print(j);
//			}
//			System.out.println("");
//		}
		
//		for(int i =1;i<=5;i++){
//			for(int j=i;j<=5;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(i);
//			}
//			System.out.println("");
//		}
		int sum=0;
		for(int i =1;i<=5;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				if((i==2&&k==3)||(i==2&&k==4)||(i==3&&k==4)) {
					System.out.print(" ");
					continue;
				}
				System.out.print(k);
			}
			System.out.println("");
			
		}
		

	}

}
