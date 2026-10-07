# Java Comprehensive Preparation Notes

Welcome to the complete Java Preparation repository. This directory contains detailed documentation, code samples, diagrams, and concepts extracted directly from all `.java` class files in the preparation modules.

---

## 📚 Table of Contents & Modules

### 1. 🟢 [Java Basics](file:///e:/Preparation/Java/Basics/Basics.md)
> **Location**: [`Basics/Basics.md`](file:///e:/Preparation/Java/Basics/Basics.md)  
> **Source Class**: [`Main.java`](file:///e:/Preparation/Java/Basics/Day%200/src/com/JAVAoneShot/Main.java)

**Topics Covered:**
- Java Program Structure & Main Method
- Variables & Primitive Data Types (`byte`, `short`, `int`, `long`, `float`, `char`, `boolean`)
- Non-Primitive Types & String Methods (`length`, `charAt`, `replace`, `substring`, concatenation)
- Arrays (1D & 2D Multidimensional Arrays, `Arrays.sort()`)
- Implicit vs. Explicit Type Casting
- Constants (`final`)
- Operators (Arithmetic, Unary `++`/`--`, Comparison, Logical `&&`/`||`/`!`)
- `Math` Class Utilities & `Scanner` User Input
- Control Flow (`if-else`, `switch-case`, `for`, `while`, `do-while`, `break`, `continue`)
- Exception Handling (`try-catch`)
- Reusable Methods
- Mini Project: Number Guessing Game

---

### 2. 🟡 [Java Collections Framework](file:///e:/Preparation/Java/Collections/Collections.md)
> **Location**: [`Collections/Collections.md`](file:///e:/Preparation/Java/Collections/Collections.md)  
> **Source Class**: [`Main.java`](file:///e:/Preparation/Java/Collections/Collections/src/Main.java)

**Topics Covered:**
- Collection vs. Collections Utility Class
- Collection & Map Hierarchy Diagrams
- **List Interface**: `ArrayList`, `LinkedList`, `Vector` (legacy & synchronization), `Stack`
- **Set Interface**: `HashSet` (hashing algorithm & node buckets), `LinkedHashSet` (insertion order), `TreeSet` (sorted order)
- **Queue Interface**: `PriorityQueue` (natural vs priority order)
- **Map Interface**: `HashMap` (node structure, collision resolution, null key/values), `LinkedHashMap`, `TreeMap`, `ConcurrentHashMap` (segment/bucket locking)
- **Collections Helper Methods**: `sort`, `reverse`, `shuffle`, `min`, `max`, `frequency`, `swap`, `binarySearch`, `fill`, `unmodifiableList`

---

### 3. 🔵 [Java 8 Features & Concurrency](file:///e:/Preparation/Java/Java%208/Java8.md)
> **Location**: [`Java 8/Java8.md`](file:///e:/Preparation/Java/Java%208/Java8.md)  
> **Source Class**: [`StreamDemo.java`](file:///e:/Preparation/Java/Java%208/java8/src/StreamDemo.java)

**Topics Covered:**
- Java 8 Ecosystem Mind Map
- Stream API Operations (`filter`, `map`, `reduce`, `sorted`, `distinct`, `limit`, `skip`, `anyMatch`, `allMatch`, `findFirst`, `count`, `forEach`)
- **Process vs. Thread**: Isolation, memory allocation, IPC, context switching
- **JVM Memory Areas**: Method Area (Metaspace), Heap Area (Young & Old Generation), Stack Area (per-thread stack frames)
- Thread Synchronization & Deadlocks
- Keywords: `volatile` (memory visibility) and `transient` (serialization exclusion)
- Serialization & Deserialization
- Functional Interfaces (`Predicate`, `Consumer`, `Supplier`, `Function`)
- Lambda Expressions & `Optional` Class

---

### 4. 🔴 [Object-Oriented Programming (OOP)](file:///e:/Preparation/Java/OOPS/OOPS.md)
> **Location**: [`OOPS/OOPS.md`](file:///e:/Preparation/Java/OOPS/OOPS.md)  
> **Source Class**: [`Main.java`](file:///e:/Preparation/Java/OOPS/OOPS/src/Main.java)

**Topics Covered:**
- Principles of OOP (Data + Behavior, Real-world modeling)
- Class, Object, and Constructor semantics
- 4 Pillars of OOP: Abstraction, Encapsulation, Inheritance, Polymorphism
- Abstract Classes vs. Interfaces (in-depth comparison table)
- Access Modifiers (`private`, default, `protected`, `public`)
- Types of Inheritance & Polymorphism (Overloading vs. Overriding)
- Composition vs. Inheritance
- The `super` keyword (3 primary use-cases)
- Variable Types: Local, Instance, and Static variables
- Java Keywords: `this`, `static`, `volatile`, `transient`
- Type Casting: Upcasting vs. Downcasting
- Object Equality: `==` vs `.equals()`
- String Immutability, String Pool, `StringBuilder` vs. `StringBuffer`
- Autoboxing & Unboxing
- Enums & Copying Objects (Shallow Copy vs. Deep Copy)

---

## 🛠️ Folder Structure

```
e:/Preparation/Java/
├── README.md                      # Master repository documentation & navigation
├── Basics/
│   ├── Basics.md                  # Generated Markdown Notes for Java Basics
│   └── Day 0/
│       └── src/com/JAVAoneShot/
│           └── Main.java          # Java Basics source code
├── Collections/
│   ├── Collections.md             # Generated Markdown Notes for Collections Framework
│   └── Collections/
│       └── src/
│           └── Main.java          # Java Collections source code
├── Java 8/
│   ├── Java8.md                   # Generated Markdown Notes for Java 8 & JVM
│   └── java8/
│       └── src/
│           └── StreamDemo.java    # Java 8 Stream API source code
└── OOPS/
    └── OOPS.md                    # Generated Markdown Notes for OOP Concepts
    └── OOPS/
        └── src/
            └── Main.java          # OOP source code
```
