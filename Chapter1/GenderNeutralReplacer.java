// Program 5: GenderNeutralReplacer.java
import java.util.Scanner;

public class GenderNeutralReplacer {

    public static String replaceGenderWords(String inputText) {
        // Replacing gender-specific words
        inputText = inputText.replaceAll("\\b(wife|husband)\\b", "spouse");
        inputText = inputText.replaceAll("\\b(man|woman)\\b", "person");
        inputText = inputText.replaceAll("\\b(son|daughter)\\b", "child");
        return inputText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph with gender-specific words:");
        String text = scanner.nextLine();

        String updatedText = replaceGenderWords(text);
        System.out.println("Updated paragraph: ");
        System.out.println(updatedText);
    }
}
