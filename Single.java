package SigleInheritance;

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

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two g = new Two();
        g.friend1();
        g.friend2();
      
	}

}
