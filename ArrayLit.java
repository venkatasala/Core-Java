package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("venkat");
		a.add("Karunas");
		a.add("shweta");
		a.add(2,"syed");
		System.out.println(a.get(3));
		a.remove(0);
		Collections.sort(a);
		for(String i: a) {
			System.out.println(i);
		}

	}

}
