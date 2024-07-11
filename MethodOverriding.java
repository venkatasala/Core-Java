package Methodoverriding;

class A{
	void run() {// same method , same parameter
		System.out.println("Excercise");
		
	}
}
class B extends A
{
	void run() {// same method , same parameter
		System.out.println("run");
	}
}
class C extends A{// same method , same parameter
	void run() {
		System.out.println("walk");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.run();
		B b=new B();
		b.run();
		C c=new C(); 
		c.run();

	}

}
