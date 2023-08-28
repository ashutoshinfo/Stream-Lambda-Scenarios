package info.ashutosh.lambda.interview;

import java.util.ArrayList;
import java.util.List;

public class CommonIn {

	// a = [5.8.6.2,9,7]
	// b = [6,2,5,8,1,3]
	// 9,7,1,3

	public static void main(String[] args) {
		Integer[] a = { 5, 8, 6, 2, 9, 7 };
		Integer[] b = { 6, 2, 5, 8, 1, 3 };

		List<Integer> integers = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				boolean flag = false;
				if (a[i] == b[j]) {
					flag = true;
					break;
				}
				if (!flag) {
					integers.add(a[i]);
				}
			}
		}
		System.out.println(integers);

	}

}

//UPDATE employee emp SET emp.balance = emp.balance - 500 WHERE emp.id=123;

//UPDATE employee emp SET emp.balance = emp.balance + 500 WHERE emp.id=124;
