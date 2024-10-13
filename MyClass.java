package var;

public class MyClass {
    // Static variable
    static int staticVariable;

    // Static block
    static {
        // Initialize static variable
        staticVariable = 10;
        System.out.println("Static block initialized. Static variable value: " + staticVariable);
    }

    // Main method
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Value of staticVariable in main method: " + staticVariable);
    }
}
/*
 * output
 
Static block initialized. Static variable value: 10
Value of staticVariable in main method: 10
*/