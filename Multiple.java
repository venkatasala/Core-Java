package multipleInheritance;


class One {
    public void friend1()
    {
        System.out.println("venkat");
    }
}

class Two extends One {
    public void friend2() { 
    	System.out.println("karunas"); }
}
class Three extends Two{
	public void friend3() {
		System.out.println("Shewta");
	}
}
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three t=new Three();
		t.friend1();
		t.friend2();
		t.friend3();
	}

}
