package info.ashutosh.lambda.scenario14;

public class PermutationsAndCombinations {

	public static void main(String[] args) {
		
		
		
		String input = "abcd";
		String input2 = "1";
		System.out.println(input2.length());
		generatePermutations("", input);
	}

	public static void generatePermutations(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
//			System.out.println("| "+prefix);
			System.out.println("#");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.println("|");
				generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
			System.out.println("@");
		}
		System.out.println("*");
	}
}
