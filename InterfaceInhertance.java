package Interface_Example;

interface showing{
	void show();
}
interface print extends show{
	void printing();
}
class B implements print{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showed");
		
	}

	@Override
	public void printing() {
		// TODO Auto-generated method stub
		System.out.println("printed");
		
	}
	
}

public class InterfaceInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.show();
		obj.printing();

	}

}
