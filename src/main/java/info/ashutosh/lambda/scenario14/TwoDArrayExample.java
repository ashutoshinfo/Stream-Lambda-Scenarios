package info.ashutosh.lambda.scenario14;

public class TwoDArrayExample {
	public static void main(String[] args) {
		// Create a 2D array with 6 rows and 6 columns
		int[][] twoDArray = new int[6][6];

		// Fill the array with random values of 0 or 1
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				twoDArray[i][j] = (int) (Math.random() * 2); // Randomly generates 0 or 1
			}
		}

		

		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(twoDArray[i][j] + " ");

			}
			System.out.println(); // Move to the next sub-array
		}
		System.out.println("----------------------------"); // Move to the next sub-array

		// Print the 2D array
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < 6; j++) {
				Integer Previousone = twoDArray[i][j];
				System.out.print(twoDArray[i][j] + " ");
				if (j != 0) {
					if (Previousone == twoDArray[i][j]) {

					}
				}
				if (j == 5) {

				}
			}
			System.out.println(); // Move to the next row
		}
	}
}
