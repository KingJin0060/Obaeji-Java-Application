import java.util.Scanner;

public class JavaExercises {
    
    public static void main(String[] args) {
        
        // Exercise 2.1 - Fill in the blanks (answers included as comments)
        
        // a) A(n) ________ begins the body of every method, and a(n) ________ ends the body of every method.
        // {Answer: { '{' begins, '}' ends }
        
        // b) You can use the _________ statement to make decisions.
        // {Answer: if }
        
        // c) _________ begins an end-of-line comment.
        // {Answer: // }
        
        // d) _________ , ________and ________ are called white space.
        // {Answer: spaces, tabs, newlines }
        
        // e) _________ are reserved for use by Java.
        // {Answer: keywords }
        
        // f) Java applications begin execution at method ________ .
        // {Answer: main }
        
        // g) Methods ________ , ________ and ________ display information in a command window.
        // {Answer: System.out.println, System.out.print, System.out.printf }
        
        
        // Exercise 2.2 - True or False (comments to explain answers)
        
        // a) Comments cause the computer to print the text after the // on the screen when the program executes.
        // False. Comments are ignored by the compiler and do not affect execution.
        
        // b) All variables must be given a type when they’re declared.
        // True. In Java, every variable must have a specific type at declaration.
        
        // c) Java considers the variables number and NuMbEr to be identical.
        // False. Java is case-sensitive, so 'number' and 'NuMbEr' are different variables.
        
        // d) The remainder operator (%) can be used only with integer operands.
        // False. The remainder operator can be used with both integers and floating-point numbers.
        
        // e) The arithmetic operators *, /, %, + and - all have the same level of precedence.
        // False. *, /, and % have higher precedence than + and -.
        
        
        // Exercise 2.3 - Write statements to accomplish tasks
        
        // a) Declare variables c, thisIsAVariable, q76354 and number to be of type int.
        int c, thisIsAVariable, q76354, number;
        
        // b) Prompt the user to enter an integer.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // c) Input an integer and assign the result to int variable value.
        int value = input.nextInt();
        
        // d) Print "This is a Java program" on one line in the command window.
        System.out.println("This is a Java program");
        
        // e) Print "This is a Java program" on two lines. The first line should end with Java.
        System.out.printf("%s %s%n", "This is a", "Java program");
        
        // f) If the variable number is not equal to 7, display "The variable number is not equal to 7”.
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }
        
        
        // Exercise 2.4 - Identify and correct the errors
        
        // a) if (c < 7); System.out.println("c is less than 7");
        // Correction: Remove the semicolon
        if (c < 7) {
            System.out.println("c is less than 7");
        }
        
        // b) if (c => 7) System.out.println("c is equal to or greater than 7");
        // Correction: Replace => with >=
        if (c >= 7) {
            System.out.println("c is equal to or greater than 7");
        }
    }
}
