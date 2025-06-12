
// public: This is an access modifier which means this class is accessible from anywhere in your project.
// class: Keyword to define a class in Java. A class is like a blueprint for creating Java programs or objects.
// HelloWorld: This is the name of the class. It should match the filename (HelloWorld.java).

public class HelloWorld {

    //public: The method is visible to the JVM (Java Virtual Machine) from outside the class.
    /*static: It means this method belongs to the class itself, not to an object of the class.
    This allows Java to run this method without creating an object of the class.*/
    //void: This means the method does not return any value.
    //main: This is the entry point of any Java program. When you run the program, Java starts executing from this method.
    /*String[] args: This is an array of String values that can take command-line arguments.
    For now, you can think of it as an input placeholder.*/

    public static void main(String[] args) {

        //System: A built-in Java class that provides access to the system — like console output.
        //out: A static member (object) of the System class. It represents the standard output stream (usually the console).
        //println(): A method that prints text to the console and moves the cursor to a new line.

        System.out.println("Hello, World!"); // Prints the string to the console.
    }
}
