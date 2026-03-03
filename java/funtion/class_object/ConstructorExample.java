public class ConstructorExample { // Renamed the class to ConstructorExample

    // Default Constructor
    ConstructorExample() {
        System.out.println("Default Constructor--");
    }

    // Parameterized Constructor
    ConstructorExample(int a, String b) {
        System.out.println("Parameterized Constructor-- " + a + " and " + b);
    }

    // Copy Constructor
    ConstructorExample(ConstructorExample other) {
        System.out.println("(copying object)");
    }

    public static void main(String[] args) {
        // Default
        ConstructorExample obj1 = new ConstructorExample();

        // Parameterized
        ConstructorExample obj2 = new ConstructorExample(10, "Hello");

        // Copy
        ConstructorExample obj3 = new ConstructorExample(obj2);
    }
}
