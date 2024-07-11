package HybridInhertance;

class A{
	public void printA() {
		System.out.println("A");
	}
}
class B extends A{
	public void printB() {
		System.out.println("B");
	}
}
class C extends A{
	public void printC() {
		System.out.println("C");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.printA();
		b.printB();
		C c=new C();
		c.printA();
		c.printC();

	}

}
