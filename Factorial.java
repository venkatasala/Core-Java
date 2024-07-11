package Recursion;

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=fact(4);
		System.out.println(result);
	}

	private static int fact(int k) {
		if(k==1) {
			return 1;
		}
		else {
			return fact(k-1)*k;
		}
	}
}
