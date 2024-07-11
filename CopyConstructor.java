package Constructor;

class Copy{
	int age;
	String name;
	public Copy(int age,String name) {
		super();
		this.age = age;
		this.name= name;
	}
	Copy(Copy obj){             //copy constructor
		this.age=obj.age;
		this.name=obj.name;
		
	}
	
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Parameterized constructor");
		Copy c=new Copy(10,"venkat");
		System.out.println(c.age+" "+c.name);
		System.out.println();
		
		System.out.println("copy constructor");
		Copy c1=new Copy(c);
		System.out.println(c1.age+" "+c1.name);

	}

}
