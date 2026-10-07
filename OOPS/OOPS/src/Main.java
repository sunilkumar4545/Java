
/*
Object-Oriented Programming:
(OOP) is a programming approach where we design a program using objects that contain:
Data → variables  & Behavior → methods\
OOP means representing real-world things as objects in code.

Class = Blueprint:
A class is a blueprint or template used to create objects.
It defines the data and methods that an object will have.

class Car {            //Class
    String brand;      // data
    int speed;         // data

    void drive() {     // methods
        System.out.println("Car is driving");
    }
}

An object is an instance of a class. It represents a real world entity and has its own state data and behavior
A class defines the structure and behavior.
An object is created at runtime, and memory is allocated for the object's instance data.
MyClass myObject = new MyClass();

Constructors have the same name as the class and may be defined inside or outside the class definition
No return type.
 */

class Car {                              // Class
    String brand;                        // Instance variable
    int speed;                           // Instance variable
    Car() {                              // Constructor
        brand = "Toyota";                // Initialize brand
        speed = 0;                       // Initialize speed
    }

    void drive() {                       // Method
        System.out.println("Car is driving");
    }
}

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car();             // Object creation
        // Constructor is automatically called
        System.out.println(car1.brand);   // Toyota
        System.out.println(car1.speed);   // 0
    }
}
/*
Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
In Java, abstraction is achieved using abstract classes and interfaces.
Can have both abstract and concrete methods
 Can have instance variables
 Does not support multiple inheritance
 Can have any access modifier
 Can have constructors
 */

abstract class Vehicle {                  // Abstract class

    abstract void start();                // Abstract method
    // No method body

    void stop() {                          // Concrete/regular method
        System.out.println("Vehicle stopped");
    }
}

class Carr extends Vehicle {                // Car inherits Vehicle

    @Override
    void start() {                         // Providing implementation
        System.out.println("Car starts");
    }
}
/*
A class implements an interface and provides the implementation of its abstract methods.
Cannot have constructors,
Fields are public static final,
Can have abstract, default, static, private methods,
Class uses implements,
A class can implement multiple interface
 */
interface Vehiclee {                    // Interface

    void start();                      // Abstract method
    void stop();                       // Abstract method
}
class Carrr implements Vehiclee {         // Car implements Vehicle

    @Override
    public void start() {              // Implementation
        System.out.println("Car starts");
    }

    @Override
    public void stop() {               // Implementation
        System.out.println("Car stops");
    }
}

/*
Encapsulation is the process of wrapping data  and the methods into a single unit.
Encapsulation = Data hiding + Controlled access
Java has four access modifiers. Private is accessible only within the same class. Default is accessible within the same package.
Protected is accessible within the same package and by child classes. Public is accessible from anywhere.
 */

/*
Inheritance is a mechanism where in a new class is derived from an existing class.
The derived class (child class) inherits the attributes and methods of the base class (parent class), allowing code reuse and the creation of a natural hierarchy.

Single	One parent → one child
Multilevel	Parent → Child → Grandchild
Hierarchical	One parent → multiple children
Multiple  parents → one child
 */

/*
Polymorphism means "one name, many forms." It allows the same method or reference to behave differently depending on the situation.
Compile-time polymorphism → Method Overloading
Runtime polymorphism → Method Overriding

Overloading = Same name + Different parameters, Same or different return type
When a child class provides its own implementation of a parent class method → Method Overriding, Same return type
Method overriding occurs when a child class provides its own implementation of an inherited method from its parent class with the same method signature.
 */

/*
Composition generally provides more flexibility because a class can use another object's functionality without being tightly coupled to its inheritance hierarchy.

super is a keyword used inside a child class to refer to its immediate parent class.
It is mainly used for 3 purposes:
1. Access parent class variables
2. Call parent class methods
3. Call parent class constructor

class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(name);       // Dog
        System.out.println(super.name); // Animal
    }
}
 */

/*
Abstraction in Java is mainly achieved using abstract classes and interfaces. An abstract class can contain both abstract and concrete methods,
while an interface defines a contract that specifies what a class must do, without defining how it should do it.
The implementing class provides the actual implementation of the interface methods.
 In this way, abstraction hides implementation details and exposes only the essential functionality.

 A variable declared inside a method, constructor, or block is called a local variable.
 class Employee {

    void display() {
        int age = 25;   // Local variable
        System.out.println(age);
    }
}

A variable declared inside a class but outside methods/constructors/blocks, without static, is an instance variable.
class Employee {

    String name;    // Instance variable
    int age;        // Instance variable

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
A variable declared inside a class using the static keyword is called a static variable or class variable.
class Employee {

    String name;                           // Instance variable
    static String company = "Cognizant";  // Static variable
}

class Employee {

    String name = "Sunil";          // Instance variable

    static String company = "ABC";  // Static variable

    void display() {

        int age = 25;               // Local variable

        System.out.println(name);
        System.out.println(company);
        System.out.println(age);
    }
}

The volatile keyword in Java is used to indicate that a variable's value can be modified by different threads. Used
with the syntax, volatile dataType variableName = x;

 When applied to a
variable, it instructs the Java Virtual Machine (JVM) to exclude that variable from the serialization process. Transient
variables are not saved in the serialized form of the object.

this is a reference variable in Java that refers to the current object of the class.
 It is mainly used to access current object's instance variables, methods, and constructors.

 static is a keyword  that belong to the class rather than individual objects. Static members are shared among all objects of that class.
 You cannot use this inside a static method. Because this refers to a particular object, while static belongs to the class.

Downcasting is converting a parent class reference back to a child class reference.
Upcasting is converting a child class reference to a parent class reference. It is implicit and safe.
class Animal {
}

class Dog extends Animal {
}
Animal animal = new Dog();


== compares whether two references refer to the same object.
.equals() can compare logical content if the class overrides it appropriately.

Java maintains a special area called the String Pool for string literals.
String s1 = "Hello";
String s2 = "Hello";
Both can refer to the same pooled String object.

StringBuilder is a mutable sequence of characters used to efficiently modify strings, especially when many concatenations are required.
Repeated String concatenation can create many String objects because String is immutable.
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("Sunil");
System.out.println(sb); --> Hello Sunil

StringBuilder → generally faster, not synchronized
StringBuffer  → synchronized, thread-safe

Autoboxing is the automatic conversion of a primitive value into its corresponding wrapper object.
int x = 10;
Integer obj = x;
Unboxing is the automatic conversion of a wrapper object into its corresponding primitive value.
Integer obj = 10;
int x = obj;
An enum is a special Java type used to represent a fixed set of predefined constants.

Shallow copy
Copies the object's fields, but referenced objects are still shared.
Employee 1 ──→ Address ←── Employee 2

Deep copy
Creates independent copies of the referenced objects too.
Employee 1 ──→ Address 1
Employee 2 ──→ Address 2
 */