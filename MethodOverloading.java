package MethodOverloading;

public class MethodOverloading {
		public int add(int x,int y) {
			return x+y;
		}
		public int add(int x,int y,int z) {
			return x+y+z;
		}
		public double add(double x,double y) {
			return x+y;
		}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.add(20, 30));
		System.out.println(m.add(5, 6));
		System.out.println(m.add(1, 2, 3));
		
		
		// TODO Auto-generated method stub

	}

}
