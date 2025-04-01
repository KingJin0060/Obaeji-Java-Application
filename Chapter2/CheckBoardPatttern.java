public class CheckerboardPattern {
    public static void main(String[] args) {
        // Define the size of the checkerboard
        int rows = 8;
        int cols = 8;

        // Loop to print the checkerboard pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
