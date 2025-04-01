import java.util.Scanner;

public class Chapter2Exercises {
    public static void main(String[] args) {
        
        // 2.1 Fill in the blanks
        System.out.println("2.1 Fill in the blanks:");
        System.out.println("a) A(n) opening brace { begins the body of every method, and a(n) closing brace } ends the body of every method.");
        System.out.println("b) You can use the if statement to make decisions.");
        System.out.println("c) // begins an end-of-line comment.");
        System.out.println("d) Spaces, tabs, and newlines are called white space.");
        System.out.println("e) Keywords are reserved for use by Java.");
        System.out.println("f) Java applications begin execution at method main.");
        System.out.println("g) Methods System.out.print, System.out.println, and System.out.printf display information in a command window.\n");

        // 2.2 True or False statements
        System.out.println("2.2 True or False:");
        System.out.println("a) False - Comments do not cause the computer to print the text after '// ' on the screen when the program executes.");
        System.out.println("b) True - All variables must be given a type when they’re declared in Java.");
        System.out.println("c) False - Java considers the variables number and NuMbEr to be different because Java is case-sensitive.");
        System.out.println("d) False - The remainder operator (%) can be used with both integer and floating-point operands.");
        System.out.println("e) False - The arithmetic operators *, /, %, +, and - do not all have the same level of precedence.\n");

        // 2.3 Write statements to accomplish each of the following tasks:
        System.out.println("2.3 Code for the tasks:");
        
        // a) Declare variables c, thisIsAVariable, q76354, and number to be of type int.
        int c, thisIsAVariable, q76354, number;
        
        // b) Prompt the user to enter an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // c) Input an integer and assign the result to int variable value
        int value = input.nextInt();
        
        // d) Print "This is a Java program" on one line in the command window. Use method System.out.println.
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines in the command window. The first line should end with Java.
        System.out.printf("This is a %s program%n", "Java");

        // f) If the variable number is not equal to 7, display "The variable number is not equal to 7”
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        // 2.4 Identify and correct the errors in each of the following statements:
        System.out.println("2.4 Corrected code:");
        // a) if (c < 7); System.out.println("c is less than 7");
        if (c < 7) {
            System.out.println("c is less than 7");
        }

        // b) if (c => 7) System.out.println("c is equal to or greater than 7");
        if (c >= 7) {
            System.out.println("c is equal to or greater than 7");
        }

        // 2.6 Write a complete program that calculates and prints the product of three integers:
        System.out.println("\n2.6 Product of three integers:");
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        System.out.print("Enter third integer: ");
        int z = input.nextInt();
        int result = x * y * z;
        System.out.printf("Product is %d%n", result);

        // 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user, and prints their sum, product, difference, and quotient.
        System.out.println("\n2.15 Arithmetic Operations:");
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.printf("Sum: %d%n", num1 + num2);
        System.out.printf("Product: %d%n", num1 * num2);
        System.out.printf("Difference: %d%n", num1 - num2);
        System.out.printf("Quotient: %d%n", num1 / num2);

        // 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum, average, product, smallest, and largest of the numbers.
        System.out.println("\n2.17 Smallest and Largest:");
        System.out.print("Enter first integer: ");
        int num3 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num4 = input.nextInt();
        System.out.print("Enter third integer: ");
        int num5 = input.nextInt();
        
        int sum2 = num3 + num4 + num5;
        int average = sum2 / 3;
        int product2 = num3 * num4 * num5;
        int smallest = Math.min(num3, Math.min(num4, num5));
        int largest = Math.max(num3, Math.max(num4, num5));
        
        System.out.printf("Sum: %d%n", sum2);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product2);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        // 2.19 What does the following code print?
        System.out.println("\n2.19 What does the following code print?");
        System.out.printf("*%n**%n***%n****%n*****%n");

        // 2.20 What does the following code print?
        System.out.println("\n2.20 What does the following code print?");
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");

        // 2.23 What does the following code print?
        System.out.println("\n2.23 What does the following code print?");
        System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");

        // 2.29 Integer Value of a Character
        System.out.println("\n2.29 Integer Value of a Character:");
        System.out.printf("The character %c has the value %d%n", 'A', (int) 'A');
        System.out.printf("The character %c has the value %d%n", 'B', (int) 'B');
        System.out.printf("The character %c has the value %d%n", 'C', (int) 'C');
        System.out.printf("The character %c has the value %d%n", 'a', (int) 'a');
        System.out.printf("The character %c has the value %d%n", 'b', (int) 'b');
        System.out.printf("The character %c has the value %d%n", '0', (int) '0');
        System.out.printf("The character %c has the value %d%n", '1', (int) '1');
        System.out.printf("The character %c has the value %d%n", '$', (int) '$');
        System.out.printf("The character %c has the value %d%n", '*', (int) '*');
        System.out.printf("The character %c has the value %d%n", '+', (int) '+');
        System.out.printf("The character %c has the value %d%n", '/', (int) '/');
        System.out.printf("The character %c has the value %d%n", ' ', (int) ' ');

        // Close the scanner
        input.close();
    }
}
