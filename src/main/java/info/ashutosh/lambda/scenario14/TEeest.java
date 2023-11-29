package info.ashutosh.lambda.scenario14;


import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TEeest {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new LinkedHashSet<>();
		Set<String> s3 = new TreeSet<String>();
		s1.add(null);
		s1.add(3);
		s1.add(2);
		s1.add(1);
		s1.add(2);
		
		s2.add(null);
		s2.add(2);
		s2.add(1);
		s2.add(2);
		s2.add(3);

//		System.out.println(s1);
//		System.out.println(s2);
		
		Hashtable<Temp, String> ht= new Hashtable<>();
		ht.put(new Temp(12), "A");
		ht.put(null, "A");
		System.out.println(ht);
		
		
	}

}

class Temp {
	int i;

	public Temp(int i) {
		super();
		this.i = i;
	}

}
