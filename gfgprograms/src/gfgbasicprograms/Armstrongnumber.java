package gfgbasicprograms;
import java.util.Scanner;
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count=0,power,dubnum,result = 0,countdigi;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number  :");
		num=scan.nextInt();
		dubnum=num;
//		digit count kantu pidikanum
		while(dubnum!=0) {  
			dubnum/=10;
			count++;
		}
		System.out.println(count);
//		
		dubnum=num;
		while(dubnum!=0) {
			power=dubnum%10;  //last digit kantu pidikirom
			result+=((int) (Math.pow(power, count)));    //kandu pidicha last digit power panrom
			dubnum/=10;     //next last digit ah remove panni viturom
		}
		System.out.println(result);
		if(result==num) {
			System.out.println(num + "  is Armstrong number");
		}
		else {
			System.out.println(num + "  is Not a Armstrong number");
		}
	}

}
