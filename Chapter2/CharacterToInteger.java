public class CharacterToInteger {
    public static void main(String[] args) {
        // Characters to display and their integer equivalents
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        // Print the integer equivalents of the characters
        for (char ch : characters) {
            System.out.printf("The character %c has the value %d%n", ch, (int) ch);
        }
    }
}
