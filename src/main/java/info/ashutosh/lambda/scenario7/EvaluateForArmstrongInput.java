package info.ashutosh.lambda.scenario7;

public class EvaluateForArmstrongInput {

	public static void main(String[] args) {

		int input = 153;

		boolean isArmstrong = isArmstrong(input);
		System.out.println(isArmstrong);
	}

	private static boolean isArmstrong(int input) {
		int ogInput = input;
		int ttlDgt = (int) Math.log10(input) + 1;
		int sum = 0;

		while (input > 0) {
			int lstDgt = input % 10;
			sum += Math.pow(lstDgt, ttlDgt);
			input /= 10;
		}

		return sum == ogInput;
	}
}
