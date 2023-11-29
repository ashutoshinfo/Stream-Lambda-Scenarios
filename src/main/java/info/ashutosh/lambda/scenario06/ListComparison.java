package info.ashutosh.lambda.scenario06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
	public static void main(String[] args) {
		// ArrayList is more efficient for random access
		List<Integer> arrayList = new ArrayList<>();

		// LinkedList is efficient for frequent insertions and removals
		List<Integer> linkedList = new LinkedList<>();

		// Add elements
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}

		// Measure time to remove an element at index 50000
		long startTime = System.nanoTime();
		arrayList.remove(50000);
		long endTime = System.nanoTime();
		System.out.println("ArrayList remove time: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		linkedList.remove(50000);
		endTime = System.nanoTime();
		System.out.println("LinkedList remove time: " + (endTime - startTime) + " ns");
	}
}
