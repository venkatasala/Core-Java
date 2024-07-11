package Encapsulation.Examle;

public class Account {
	private String name;
	private long Accountnumber;
	private String email;
	
//	public Account(String name, long accountnumber, String email) {
//		super();
//		this.name = name;
//		this.Accountnumber = accountnumber;
//		this.email = email;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountnumber() {
		return Accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		Accountnumber = accountnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", Accountnumber=" + Accountnumber + ", email=" + email + "]";
	}
	
	
	

}
