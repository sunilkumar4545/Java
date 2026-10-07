# Object-Oriented Programming (OOP) in Java

This document contains OOP concepts, design principles, code demonstrations, and core Java interview topics compiled from `OOPS/OOPS/src/Main.java`.

---

## 1. Fundamentals of OOP

**Object-Oriented Programming (OOP)** is a programming paradigm based on designing applications using **objects** containing:
- **Data** → Fields / Variables (State)
- **Behavior** → Methods / Functions

OOP allows representing real-world entities directly in code.

### Class vs. Object vs. Constructor

| Entity | Definition | Key Characteristics |
| :--- | :--- | :--- |
| **Class** | Blueprint or template for creating objects | Defines structure, fields, and method signatures |
| **Object** | Instance of a class created at runtime | Allocates memory for instance data using `new` |
| **Constructor** | Special method used to initialize objects | Has the exact same name as the class; **no return type** |

### Basic Code Example

```java
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

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();             // Object creation & constructor execution
        System.out.println(car1.brand);   // Output: Toyota
        System.out.println(car1.speed);   // Output: 0
    }
}
```

---

## 2. Four Pillars of OOP

```
                   OOP PILLARS
  ┌───────────────┬───────────────┬───────────────┬───────────────┐
  │  Abstraction  │ Encapsulation │  Inheritance  │ Polymorphism  │
  └───────────────┴───────────────┴───────────────┴───────────────┘
```

---

## 3. Abstraction

**Abstraction** is the process of hiding internal implementation details and exposing only essential functionality to the user.

In Java, abstraction is achieved using:
1. **Abstract Classes** (0% to 100% abstraction)
2. **Interfaces** (100% abstraction up to Java 7; supports default/static methods in Java 8+)

### 1. Abstract Class Example

- Can have both `abstract` (no body) and concrete methods.
- Can have instance variables and constructors.
- Does **not** support multiple inheritance directly.

```java
abstract class Vehicle {                  // Abstract class
    abstract void start();                // Abstract method (no body)

    void stop() {                         // Concrete method
        System.out.println("Vehicle stopped");
    }
}

class Carr extends Vehicle {              // Subclass inherits Vehicle
    @Override
    void start() {                        // Providing implementation
        System.out.println("Car starts");
    }
}
```

### 2. Interface Example

- A contract defining methods a class must implement.
- Cannot have constructors.
- Fields are implicitly `public static final`.
- A class can `implement` **multiple interfaces**.

```java
interface Vehiclee {                     // Interface
    void start();                        // Abstract method
    void stop();                         // Abstract method
}

class Carrr implements Vehiclee {        // Car implements Vehiclee
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
```

### Abstract Class vs. Interface Comparison

| Feature | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Methods** | Can have both abstract and concrete methods | Abstract, default, static, and private methods |
| **Variables** | Can have instance, static, final, non-final variables | Fields are strictly `public static final` |
| **Constructors** | Supported | Not supported |
| **Inheritance** | Single class inheritance (`extends`) | Multiple interface implementation (`implements`) |
| **Access Modifiers** | Any access modifier (`public`, `protected`, `private`) | Methods are implicitly `public` (unless `private`) |

---

## 4. Encapsulation

**Encapsulation** is wrapping data (fields) and methods operating on that data into a single unit (class), protecting it from unauthorized external access.

$$\text{Encapsulation} = \text{Data Hiding} + \text{Controlled Access}$$

### Java Access Modifiers

| Access Modifier | Same Class | Same Package | Subclass (Other Package) | World (Everywhere) |
| :--- | :---: | :---: | :---: | :---: |
| `private` | Yes | No | No | No |
| Default (no modifier) | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes | No |
| `public` | Yes | Yes | Yes | Yes |

---

## 5. Inheritance

**Inheritance** is a mechanism where a child (derived) class acquires properties and behaviors of a parent (base) class, encouraging code reusability.

### Types of Inheritance

- **Single Inheritance**: One parent $\rightarrow$ One child
- **Multilevel Inheritance**: Parent $\rightarrow$ Child $\rightarrow$ Grandchild
- **Hierarchical Inheritance**: One parent $\rightarrow$ Multiple children
- **Multiple Inheritance**: Multiple parents $\rightarrow$ One child (Supported in Java **only via Interfaces**)

---

## 6. Polymorphism

**Polymorphism** means *"one name, many forms"*. It allows the same method or reference to behave differently based on context.

```
                    Polymorphism
                         │
        ┌────────────────┴────────────────┐
        │                                 │
Compile-time Polymorphism         Runtime Polymorphism
  (Method Overloading)             (Method Overriding)
```

### Method Overloading (Compile-time)
- Same method name in the same class.
- **Different parameters** (number, order, or types of parameters).
- Return type can be the same or different.

### Method Overriding (Runtime)
- Child class provides its own specific implementation of a method already declared in its parent class.
- **Same method signature** (name, parameters, and return type).

---

## 7. Composition vs. Inheritance

- **Inheritance** ("IS-A" relationship): Tightly couples classes.
- **Composition** ("HAS-A" relationship): Provides greater flexibility by including references to other objects rather than inheriting their class structure.

---

## 8. The `super` Keyword

The `super` keyword refers to the immediate parent class object.

### 3 Main Uses of `super`:
1. Access parent class variables.
2. Call parent class methods.
3. Invoke parent class constructors.

```java
class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(name);       // Output: Dog
        System.out.println(super.name); // Output: Animal
    }
}
```

---

## 9. Types of Variables in Java

```java
class Employee {
    String name = "Sunil";          // Instance Variable: inside class, outside methods
    static String company = "ABC";  // Static Variable: shared across all instances

    void display() {
        int age = 25;               // Local Variable: inside method block

        System.out.println(name);
        System.out.println(company);
        System.out.println(age);
    }
}
```

1. **Local Variables**: Declared inside a method, constructor, or block. Scope is limited to that block.
2. **Instance Variables**: Declared inside a class but outside methods/constructors. Bound to specific object instances.
3. **Static Variables (Class Variables)**: Declared with the `static` keyword. Shared across all instances of the class.

---

## 10. Java Keywords Overview

- **`this`**: Reference variable pointing to the current class object. Used to access instance variables, invoke constructors, or pass current instance. Cannot be used inside static methods.
- **`static`**: Indicates members belong to the class rather than individual object instances.
- **`volatile`**: Instructs the JVM to read/write variable updates directly to main memory across threads.
- **`transient`**: Excludes fields from the object serialization process.

---

## 11. Type Casting in OOP

### Upcasting
- Converting a child class reference to a parent class reference.
- **Implicit** and completely safe.

```java
Animal animal = new Dog(); // Upcasting
```

### Downcasting
- Converting a parent class reference back to a child class reference.
- Requires explicit casting and can throw `ClassCastException` if types don't match at runtime.

---

## 12. Object Equality (`==` vs. `.equals()`)

- **`==` Operator**: Compares reference memory addresses (checks if both references point to the exact same object).
- **`.equals()` Method**: Compares logical content equality when overridden by the class.

---

## 13. Strings & String Pool

Java maintains a special memory region called the **String Pool** within the Heap to store string literals efficiently.

```java
String s1 = "Hello";
String s2 = "Hello"; // References existing pooled String object
```

### `StringBuilder` vs `StringBuffer`

| Feature | `StringBuilder` | `StringBuffer` |
| :--- | :--- | :--- |
| **Mutability** | Mutable | Mutable |
| **Thread Safety** | Not Synchronized (Not thread-safe) | Synchronized (Thread-safe) |
| **Performance** | Faster | Slower due to locking overhead |

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("Sunil");
System.out.println(sb); // Output: Hello Sunil
```

---

## 14. Autoboxing & Unboxing

- **Autoboxing**: Automatic conversion of primitive types to their corresponding wrapper class objects (`int` $\rightarrow$ `Integer`).
- **Unboxing**: Automatic conversion of wrapper objects back to primitive types (`Integer` $\rightarrow$ `int`).

```java
// Autoboxing
int x = 10;
Integer obj = x;

// Unboxing
Integer obj2 = 10;
int y = obj2;
```

---

## 15. Enums

An **enum** is a special Java type used to define a fixed set of predefined named constants.

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

---

## 16. Shallow Copy vs. Deep Copy

```
Shallow Copy:
Employee 1 ───┐
              ├───> Address Object (Shared)
Employee 2 ───┘

Deep Copy:
Employee 1 ───────> Address Object 1
Employee 2 ───────> Address Object 2 (Independent copy)
```

- **Shallow Copy**: Copies field values. If fields refer to objects, only object references are copied (referenced objects remain shared).
- **Deep Copy**: Creates independent copies of the main object as well as all referenced objects recursively.
