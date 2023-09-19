package info.ashutosh.lambda.scenario02;

public class Test {
	public static void main(String[] args) {

		Integer[] input = { 100, 10, 20, 20, 10, 30, 40, 70, 80, 90, 100, 10, 20, 30 };
		System.out.println(Logic.countAccurencs(input));
		System.out.println(Logic.removeDuplicateandSort(input));
		System.out.println(Logic.countAccurencsLambda(input));

	}
}
