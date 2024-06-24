package gfgbasicprograms;

import java.util.Scanner;

public class vowlesex {


	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name :");
		name=scan.next();
		System.out.println("Your name " + name.toUpperCase() + " vowels counts are : " + vowelscount(name));
	}
	public static int vowelscount(String str) {
		int count = 0;
		for (int i=0;i<str.length();i++) {
			char ans = str.charAt(i);//string length la irukra charcters kantupidika
			if (ans == 'a' || ans == 'e' || ans == 'i' || ans == 'o' || ans == 'u' ) {
			count++;	
			}
		}
		return count;
	}
}
