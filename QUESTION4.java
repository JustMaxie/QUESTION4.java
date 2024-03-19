public class QUESTION4 {
    // Instance variable
    private String message;

    // Constructor
    public QUESTION4(String message) {
        this.message = message;
    }

    // Non-static method
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    // Static methods
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    // Main method to test the class
    public static void main(String[] args) {
        QUESTION4 obj = new QUESTION4("Hello, World!");

        obj.displayMessage();  // Call to non-static method

        staticMethod1();  // Call to static method 1
        staticMethod2();  // Call to static method 2
    }
}
