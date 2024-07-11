package Runtimepolymorphism;

class Shape{
	public void draw() {
		System.out.println("Drawing the shapes");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Draw the Rectangle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Draw the Square");
	}
}
public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangle();
		s.draw();
		Shape s1=new Square();
		s1.draw();
	}

}
