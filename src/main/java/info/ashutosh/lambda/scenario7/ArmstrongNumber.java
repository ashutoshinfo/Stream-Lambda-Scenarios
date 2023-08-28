package info.ashutosh.lambda.scenario7;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		if (isArmstrongNumber(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}

	static boolean isArmstrongNumber(int number) {
		int originalNumber = number;
		int numberOfDigits = (int) Math.log10(number) + 1;
		int sum = 0;

		while (number > 0) {
			int digit = number % 10; // Extract the last digit of the number
			sum += Math.pow(digit, numberOfDigits); // Add the digit raised to the power of number of digits to the sum
			number /= 10; // Remove the last digit from the number
		}

		return sum == originalNumber; // Check if the sum is equal to the original number
	}
}
