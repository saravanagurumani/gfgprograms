package gfgbasicprograms;

public class genrateotp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your OTP is : " + otp());
	}
	public static int otp() {
		int ans=(int)(Math.random()*9999);
		return ans;
	}

}
