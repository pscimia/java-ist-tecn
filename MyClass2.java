package var;

public class MyClass2 {
    // Static variable
    static int staticVariable = 10;

    // Main method
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Value of staticVariable: " + staticVariable);

        // Modifying static variable
        staticVariable = 20;
        System.out.println("Updated value of staticVariable: " + staticVariable);

        // Creating instances of MyClass
        MyClass2 obj1 = new MyClass2();
        MyClass2 obj2 = new MyClass2();

        // Accessing static variable through instances
        System.out.println("Value of staticVariable through obj1: " + obj1.staticVariable);
        System.out.println("Value of staticVariable through obj2: " + obj2.staticVariable);

        // Modifying static variable through instances
        obj1.staticVariable = 30;
        System.out.println("Updated value of staticVariable through obj1: " + obj1.staticVariable);
        System.out.println("Value of staticVariable through obj2 after modification through obj1: " + obj2.staticVariable);
    }
}

/*
 * output
 Value of staticVariable: 10
Updated value of staticVariable: 20
Value of staticVariable through obj1: 20
Value of staticVariable through obj2: 20
Updated value of staticVariable through obj1: 30
Value of staticVariable through obj2 after modification through obj1: 30
*/
