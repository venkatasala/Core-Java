package HashMaps;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> c = new HashMap<String, String>();
		c.put("Tamil Nadu", "Chennai");
		c.put("Karnataka", "Bangalore");
		c.put("Telugana", "Hyderabad");
		c.put("Andra", "Vijayawada");
		System.out.println(c.get("Tamil Nadu"));
		System.out.println(c);
		for(String i:c.keySet()) {
			System.out.println(i);
		}
	}

}
