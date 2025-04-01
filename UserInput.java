import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	
	
	    System.out.print("Enter Your name: "); 
	    String name = input.nextLine();

	    System.out.print("Enter Your address: "); 
	    String address = input.nextLine();  
		
		System.out.print("Enter Your age: "); 
	    byte age = input.nextByte();
		
		System.out.printf("Enter Your account balance: ");
		float balance = input.nextFloat();
		System.out.println();
		
		System.out.printf("You are Living in %s %n",address);
		boolean is 
		
		System.out.printf("Hello %s, you are welcome to First Bank%n",name);
		System.out.printf("Your account balance is %.2f%n",address);
		System.out.printf("You are Living in %s %n",address);
		System.out.printf("You are %d years old%n",age);
		
	}
}			