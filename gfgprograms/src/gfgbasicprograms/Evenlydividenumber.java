package gfgbasicprograms;

import java.util.Scanner;

public class Evenlydividenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number : ");
		int givennum=scan.nextInt();
		int dubnum=givennum;
		while(givennum>0){
			int lastdigit = givennum % 10;// we gave last digit number
			if(lastdigit>0) {  
				if(dubnum % lastdigit == 0) {  // given number oda last digit vachu nan given number ah divde panren
					count++;
				}
			}
			givennum/=10;  // we check the first digit of the given number and again check the given number by first digit
		}
		System.out.println("the answer is : " + count);
	}

}
