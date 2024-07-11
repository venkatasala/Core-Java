package Interface_Example;

interface Draw{
	void drawing();
}
class Circle implements Draw{

	@Override
	public void drawing() {
		// TODO Auto-generated method stub
		System.out.println("Draw the circle");
		
	} 
	
}
class Rectangle implements Draw{

	@Override
	public void drawing() {
		// TODO Auto-generated method stub
		System.out.println("Draw the Rectangle");
		
	}
	
}

public class InterfaceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw d=new Circle();
		Draw d1=new Rectangle();
		d.drawing();
		d1.drawing();
		
	}

}
