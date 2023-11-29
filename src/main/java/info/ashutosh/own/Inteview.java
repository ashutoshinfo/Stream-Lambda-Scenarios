package info.ashutosh.own;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Inteview {

	public static void main(String[] args) {

		List<Integer> number = new ArrayList<>();
		number.add(2);
		number.add(1);
		number.add(2);
		number.add(2);
		
		System.out.println(3 % 2 == 0);

		List<Integer> odd = number.stream()
				.filter(in -> in % 2 != 0)
				.collect(Collectors.toList());

		if (odd.size() == 0) {
			System.out.print("Comains not odd");
		} else {
			System.out.print("Comains odd");
		}

	}
}