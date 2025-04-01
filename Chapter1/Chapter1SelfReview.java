import java.util.Scanner;

public class Chapter1SelfReview {
    public static void main(String[] args) {
        
        // 1.1 Fill in the blanks in each of the following statements:
        System.out.println("1.1 Fill in the blanks:");
        System.out.println("a) Computers process data under the control of sets of instructions called programs.");
        System.out.println("b) The key logical units of the computer are the CPU, memory, input devices, output devices, storage, and network.");
        System.out.println("c) The three types of languages are machine language, assembly language, and high-level language.");
        System.out.println("d) The programs that translate high-level language programs into machine language are called compilers.");
        System.out.println("e) Android is an operating system for mobile devices based on the Linux kernel and Java.");
        System.out.println("f) Release software is generally feature complete, (supposedly) bug free, and ready for use by the community.");
        System.out.println("g) The Wii Remote, as well as many smartphones, use a(n) accelerometer which allows the device to respond to motion.\n");

        // 1.2 Fill in the blanks in each of the following sentences about the Java environment:
        System.out.println("1.2 Java Environment Fill in the blanks:");
        System.out.println("a) The Java command from the JDK executes a Java application.");
        System.out.println("b) The javac command from the JDK compiles a Java program.");
        System.out.println("c) A Java source code file must end with the .java file extension.");
        System.out.println("d) When a Java program is compiled, the file produced by the compiler ends with the .class file extension.");
        System.out.println("e) The file produced by the Java compiler contains bytecodes that are executed by the Java Virtual Machine.\n");

        // 1.3 Fill in the blanks in each of the following statements:
        System.out.println("1.3 Object-Oriented Concepts Fill in the blanks:");
        System.out.println("a) Objects enable the design practice of abstraction —although they may know how to communicate with one another across well-defined interfaces, they normally are not allowed to know how other objects are implemented.");
        System.out.println("b) Java programmers concentrate on creating classes, which contain fields and the set of methods that manipulate those fields and provide services to clients.");
        System.out.println("c) The process of analyzing and designing a system from an object-oriented point of view is called object-oriented design.");
        System.out.println("d) A new class of objects can be created conveniently by inheritance —the new class (called the subclass) starts with the characteristics of an existing class (called the superclass), possibly customizing them and adding unique characteristics of its own.");
        System.out.println("e) Unified Modeling Language is a graphical language that allows people who design software systems to use an industry-standard notation to represent them.");
        System.out.println("f) The size, shape, color, and weight of an object are considered attributes of the object’s class.\n");

        // 1.4 Fill in the blanks in each of the following statements:
        System.out.println("1.4 Computer Logic and Units Fill in the blanks:");
        System.out.println("a) The logical unit that receives information from outside the computer for use by the computer is the input device.");
        System.out.println("b) The process of instructing the computer to solve a problem is called programming.");
        System.out.println("c) Assembly language is a type of computer language that uses English-like abbreviations for machine-language instructions.");
        System.out.println("d) Output device is a logical unit that sends information which has already been processed by the computer to various devices so that it may be used outside the computer.");
        System.out.println("e) Memory and storage are logical units of the computer that retain information.");
        System.out.println("f) Arithmetic Logic Unit is a logical unit of the computer that performs calculations.");
        System.out.println("g) Control Unit is a logical unit of the computer that makes logical decisions.");
        System.out.println("h) High-level language languages are most convenient to the programmer for writing programs quickly and easily.");
        System.out.println("i) The only language a computer can directly understand is that computer’s machine language.");
        System.out.println("j) Control Unit is a logical unit of the computer that coordinates the activities of all the other logical units.\n");

        // 1.5 Fill in the blanks in each of the following statements:
        System.out.println("1.5 Programming Languages Fill in the blanks:");
        System.out.println("a) The Java programming language is now used to develop large-scale enterprise applications, to enhance the functionality of web servers, to provide applications for consumer devices and for many other purposes.");
        System.out.println("b) C initially became widely known as the development language of the UNIX operating system.");
        System.out.println("c) TCP/IP ensures that messages, consisting of sequentially numbered pieces called bytes, were properly routed from sender to receiver, arrived intact, and were assembled in the correct order.");
        System.out.println("d) The C++ programming language was developed by Bjarne Stroustrup in the early 1980s at Bell Laboratories.\n");

        // 1.6 Fill in the blanks in each of the following statements:
        System.out.println("1.6 Java Program Phases Fill in the blanks:");
        System.out.println("a) Java programs normally go through five phases— editing, compiling, loading, interpretation, and execution.");
        System.out.println("b) An Integrated Development Environment (IDE) provides many tools that support the software development process, such as editors for writing and editing programs, debuggers for locating logic errors in programs, and many other features.");
        System.out.println("c) The command java invokes the Java Virtual Machine (JVM), which executes Java programs.");
        System.out.println("d) A virtual machine is a software application that simulates a computer, but hides the underlying operating system and hardware from the programs that interact with it.");
        System.out.println("e) The JVM takes the .class files containing the program’s bytecodes and transfers them to primary memory.");
        System.out.println("f) The JVM examines bytecodes to ensure that they’re valid.\n");

        // 1.7 Explain the two compilation phases of Java programs:
        System.out.println("1.7 Compilation Phases of Java Programs:");
        System.out.println("1. Compilation: During this phase, the Java source code (with a .java extension) is converted into bytecode by the javac compiler. The resulting bytecode file has a .class extension.");
        System.out.println("2. Interpretation/Execution: The bytecode file is then executed by the Java Virtual Machine (JVM). The JVM reads the bytecode and translates it into machine code that can be executed on the underlying hardware.\n");

        // 1.8 Apply object-oriented concepts to a wristwatch:
        System.out.println("1.8 Wristwatch Object-Oriented Concepts:");
        System.out.println("For a wristwatch:");
        System.out.println("Object: A wristwatch can be considered an object in an object-oriented program.");
        System.out.println("Attributes: Examples include the color, size, material, brand, and time displayed.");
        System.out.println("Behaviors: A watch might have behaviors like 'tell time,' 'alarm,' 'set time,' etc.");
        System.out.println("Class: A class might be created for watches, with attributes like color and behaviors like setting the time.");
        System.out.println("Inheritance: A subclass like 'Alarm Clock' could inherit from the watch class, adding an alarm feature.");
        System.out.println("Modeling: A programmer can create a model of the watch in a program, abstracting it as an object with relevant attributes and behaviors.");
        System.out.println("Messages: A message could be sent to the watch to 'set time' or 'display time.'");
        System.out.println("Encapsulation: The internal mechanisms of how the watch works (e.g., the gears inside) would be hidden from the user.");
        System.out.println("Interface: The user interacts with the watch through its interface, which could be buttons, touch screens, or voice commands.");
        System.out.println("Information hiding: The internal workings (like the movement mechanism) are hidden from the user.\n");

        // 1.9 (Test-Drive: Carbon Footprint Calculator)
        System.out.println("1.9 Carbon Footprint Calculator:");
        System.out.println("Research the formulas for calculating carbon footprints, such as based on transportation, energy usage, and waste. Build formulas into your program for calculating carbon emissions from activities like driving, flying, or electricity usage.\n");

        // 1.10 (Test-Drive: Body Mass Index Calculator)
        System.out.println("1.10 BMI Calculator:");
        System.out.println("The BMI formula is BMI = weight (kg) / height (m)^2. Use this formula to compute BMI from a person’s weight and height.\n");

        // 1.11 (Attributes of Hybrid Vehicles)
        System.out.println("1.11 Hybrid Vehicle Attributes:");
        System.out.println("Hybrid vehicles' attributes include city-miles-per-gallon, highway-miles-per-gallon, battery type (e.g., lithium-ion), and environmental impact. Research how these attributes vary across different models.\n");

        // 1.12 (Gender Neutrality Program)
        System.out.println("1.12 Gender Neutrality Program:");
        System.out.println("To create a gender-neutrality program, you would read through a given paragraph, look for gender-specific words, and replace them with gender-neutral terms. Ensure replacements are done systematically to avoid strange combinations like 'woperchild.'\n");
    }
}
