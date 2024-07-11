package Static_blockes;

public class StaticExample {
	static int i;
	int j;
	
	static {
		i=10;
		System.out.println("Static method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticExample.i);

	}

}
