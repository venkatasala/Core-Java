package Constructor;

class Parameterized{
	int age;
	String name;
	public Parameterized(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized p=new Parameterized(10, "venkat");
		System.out.println(p.name+" "+p.age);
		
		

	}

}
