package Compiletimepolymorphism;

class Methodoverloading{
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(double a, double b) {
		double c=a+b;
		System.out.println(c);
	}
}

public class Compilepoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading m=new Methodoverloading();
		m.add(1,2);
		m.add(1.2, 2.4);
	}


}
