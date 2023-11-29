package info.ashutosh.lambda.scenario14;

public class ThreeDArrayExample {
	public static void main(String[] args) {
		// Creating a 3D array with dimensions 2x3x4
		// This represents a cube with 2 layers, each layer containing 3 rows and 4
		// columns.
		int[][][] threeDimArray = new int[2][3][4];

		// Setting values in the 3D array
		threeDimArray[0][1][2] = 42; // Setting a value at a specific position

		// Retrieving a value from the 3D array
		int value = threeDimArray[0][1][2];

		// Printing the 3D array
		for (int layer = 0; layer < 2; layer++) {
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 4; col++) {
					System.out.print(threeDimArray[layer][row][col] + " ");
				}
				System.out.println(); // Move to the next row
			}
			System.out.println(); // Separate layers
		}
	}
}
