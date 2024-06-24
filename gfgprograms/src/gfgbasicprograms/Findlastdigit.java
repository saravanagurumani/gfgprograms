package gfgbasicprograms;

public class Findlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=21,b=5;
		int ans=(int) (Math.pow(a, b));
		System.out.println("the power of number is : " + ans);
		System.out.println("Firstdigit " + firstdigit(ans));
		System.out.println("lastdigit " + lastdigit(ans));
	}
	public static int lastdigit(long in) {
		return (int) (in%10);
	}
	public static int firstdigit(long in2) {
		while(in2 >= 10)
		in2/=10;
		return (int) in2;
	}

}
