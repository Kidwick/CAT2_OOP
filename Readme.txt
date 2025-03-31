
1. `Student.java` (Encapsulation)
- Contains a `Student` class with private attributes (`name` and `grade`).
- Uses public getter and setter methods to access and modify these attributes.
- Ensures that `grade` remains within `0-100`; otherwise, it sets the grade to `0`.

2. `MathOperations.java` (Method Overloading)
- Implements method overloading with two `multiply()` methods.
- One method multiplies two integers, while the other multiplies three.

3. `Animal.java`, `Dog.java`, `Cat.java` (Method Overriding & Polymorphism)
- `Animal` class has a `makeSound()` method.
- `Dog` and `Cat` override this method with their own implementations.
- Demonstrates polymorphism by calling `makeSound()` on both subclasses.

4. `Appliance.java`, `Fan.java`, `TV.java` (Abstraction)
- `Appliance` is an abstract class with an abstract method `turnOn()`.
- `Fan` and `TV` classes implement `turnOn()` with specific behaviors.
- Shows abstraction by creating objects of both classes and calling `turnOn()`.

5. `Division.java` (Exception Handling)
- Accepts two numbers from the user and performs division.
- Catches `ArithmeticException` if the second number is `0` and prints `"Cannot divide by zero!"`.
- Uses a `finally` block to close the `Scanner`.


