//in given number Find Last Digit and first digit number

package gfgbasicprograms;

import java.util.Scanner;

public class Lastdigitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userin;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number :");
		userin=scan.nextInt();
		System.out.println("Firstdigit of number  " + userin + "  is : " + firstdigit(userin));
		System.out.println("lastdigit of number  " + userin + "  is : " + lastdigit(userin));

	}
	public static int firstdigit(int ans) {
		while(ans >= 10) {
			ans /= 10;
		}
		return ans;
	}
		
		public static int lastdigit(int ans) {
			ans %= 10;
			return ans;
	}

}
