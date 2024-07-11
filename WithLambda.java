package Lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<>();
		l.add("venkat");
		l.add("Karuna");
		l.add("Guna");
		l.add("Abirami");
		// Lambda Expression
		Collections.sort(l,(s1,s2)->s1.compareTo(s2));
		for(String s:l) {
			System.out.println(s);
		}

	}

}
