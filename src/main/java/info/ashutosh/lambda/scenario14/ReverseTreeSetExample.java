package info.ashutosh.lambda.scenario14;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ReverseTreeSetExample {
	public static void main(String[] args) {
		// Create a TreeSet
		TreeSet<Integer> treeSet = new TreeSet<>();

		// Add elements to the TreeSet
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(8);
		treeSet.add(1);
		treeSet.add(9);

		// Create a reverse view of the TreeSet
		NavigableSet<Integer> reverseTreeSet = treeSet.descendingSet();

		// Print the original TreeSet
		System.out.println("Original TreeSet: " + treeSet);

		// Print the reverse TreeSet
		System.out.println("Reverse TreeSet: " + reverseTreeSet);
	}
}
