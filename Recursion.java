package Recursion;


public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=Sum(10);
		System.out.println(s);
	}
	private static int Sum(int k) {
		// TODO Auto-generated method stub
		if(k>0) {
			return k+Sum(k-1);
		}
		else {
			return 0;
		}
	}

	
}
