package info.ashutosh.own;

import java.util.HashMap;

public class Snippet {
	public static void main(String[] args) {
		String s1 = "abc";
		StringBuilder s2 = new StringBuilder().append("abc");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		HashMap<String, Integer> hm = new HashMap<>();
		System.out.println(new String("abc"));
		hm.put(new String("abc"), 14);
		System.out.println(s1);
		hm.put(s1, 15);
		System.out.println(s2.toString());
		hm.put(s2.toString(), 16);

		System.out.println(hm.get(new String("abc")));
		System.out.println(hm.get(s1));
		System.out.println(hm.get(s2.toString()));
		System.out.println(hm.get("abc"));
	}
}
