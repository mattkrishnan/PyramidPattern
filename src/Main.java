public class Main {

    public static void main(String[] args) {
        int strNum = 0,	// Initialize decending numbers
                whtSpaceEnd = 7;		// Initialize number of white space in row
        // Display number of rows and numbers in each row
        for (int row = 1; row <= 128; row += row) {
            // This creates white space
            for (int whtSpaceBeg = 0; whtSpaceBeg < whtSpaceEnd; whtSpaceBeg++) {
                System.out.print("    ");
            }
            // Prints numbers going up
            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }
            // Prints numbers going down
            for (int r = strNum; r > 0 ; r /= 2 ) {
                System.out.printf("%4d", (r));
            }
            System.out.println();	// End line
            whtSpaceEnd--; 				// Decrement whtSpaceEnd
            strNum = row;			// Assign row to startRight
        }
    }
}
