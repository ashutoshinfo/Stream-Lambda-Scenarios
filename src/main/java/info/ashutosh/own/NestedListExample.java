package info.ashutosh.own;

import java.util.ArrayList;
import java.util.List;

public class NestedListExample {

	public static void main(String[] args) {
		List<Integer> innerList2 = new ArrayList<>();
		innerList2.add(7);
		innerList2.add(8);
		innerList2.add(9);

		List<Object> innerList1 = new ArrayList<>();
		innerList1.add(4);
		innerList1.add(5);
		innerList1.add(6);
		innerList1.add(innerList2);

		List<Object> outerList = new ArrayList<>();
		outerList.add(1);
		outerList.add(2);
		outerList.add(3);
		outerList.add(innerList1);

		System.out.println(outerList);
	}
}
