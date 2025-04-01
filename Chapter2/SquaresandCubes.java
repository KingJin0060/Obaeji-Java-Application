public class SquaresAndCubes {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s%-10s%-10s%n", "Number", "Square", "Cube");

        // Print squares and cubes of numbers 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-10d%-10d%-10d%n", i, i * i, i * i * i);
        }
    }
}
