import java.util.Scanner;

class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demonstrating Encapsulation
        Student student = new Student("John", 110);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());

        // Demonstrating Method Overloading
        MathOperations math = new MathOperations();
        System.out.println("Multiplication of 2 & 3: " + math.multiply(2, 3));
        System.out.println("Multiplication of 2, 3 & 4: " + math.multiply(2, 3, 4));
        
        // Demonstrating Method Overriding
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
        
        // Demonstrating Abstraction
        Appliance myFan = new Fan();
        Appliance myTV = new TV();
        myFan.turnOn();
        myTV.turnOn();

        // Exception Handling
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            scanner.close();
        }
    }
}
