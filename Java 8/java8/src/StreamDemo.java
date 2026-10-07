/*
Java 8
│
├── Lambda Expressions
├── Functional Interfaces
│   ├── Predicate
│   ├── Consumer
│   ├── Supplier
│   └── Function
│
├── Method References
├── Stream API
│   ├── filter
│   ├── map
│   ├── sorted
│   ├── distinct
│   ├── limit / skip
│   ├── reduce
│   └── collect
│
├── Optional
│
└── Default & Static Methods in Interfaces

Java 8 Stream API provides a functional approach to process collections of objects.
 Streams support sequential and parallel operations on data.
 */

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter - filters elements based on condition
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        // Result: [2, 4, 6, 8, 10]

        // map - transforms elements
        List<Integer> squares = numbers.stream().map(n -> n * n)
                .collect(Collectors.toList());
        // Result: [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

        // reduce - combines elements
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        // Result: 55

        // sorted - sorts elements
        List<Integer> sorted = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // distinct - removes duplicates
        List<Integer> unique = Arrays.asList(1, 1, 2, 2, 3).stream()
                .distinct()
                .collect(Collectors.toList());
        // Result: [1, 2, 3]

        // limit and skip
        List<Integer> limited = numbers.stream()
                .skip(2)
                .limit(5)
                .collect(Collectors.toList());
        // Result: [3, 4, 5, 6, 7]

        // anyMatch, allMatch, noneMatch
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);

        // findFirst, findAny
        Optional<Integer> first = numbers.stream().findFirst();

        // count
        long count = numbers.stream().filter(n -> n > 5).count();

        // forEach
        numbers.stream().forEach(System.out::println);
    }
}

/*
Process:
Independent executing program with its own memory space
Contains at least one thread (main thread)
Has its own address space, heap, stack, and system resources
Processes are isolated from each other
Inter-process communication (IPC) is expensive


Thread:
Lightweight unit of execution within a process
Shares memory space with other threads in the same process
Has its own stack but shares heap with other threads
Threads within a process can communicate directly
Context switching between threads is faster

JVM allocates memory in different areas for efficient program execution. The main memory areas are:

Method Area (Metaspace):

Stores class-level data like class structures, method data, and runtime constant pool
Shared among all threads
Created during JVM startup
Heap Area:

Stores all objects and their instance variables
Shared among all threads
Managed by Garbage Collector
Divided into Young Generation (Eden, Survivor spaces) and Old Generation
Stack Area:

Each thread has its own stack
Stores local variables, method calls, and partial results
Contains stack frames for each method invocation
Memory is automatically allocated/deallocated


Synchronization is a mechanism that ensures only one thread can access a shared resource at a time. It prevents race conditions and ensures thread safety.

A deadlock is a situation where two or more threads are blocked forever, each waiting for the other to release a lock.

The volatile keyword in Java is used to indicate that a variable's value may be modified by different threads.
 It ensures visibility of changes across threads and prevents caching of the variable.

The transient keyword in Java is used to indicate that a field should not be serialized when the object is converted to a byte stream.

Serialization is the process of converting an object's state into a byte stream. Deserialization is the reverse process - converting a byte stream back into an object.

A functional interface is an interface that contains exactly one abstract method. They are the foundation for lambda expressions in Java 8.
Key Characteristics:
Has exactly one abstract method
Can have multiple default and static methods
Can be annotated with @FunctionalInterface
Used as target types for lambda expressions

Lambda expressions are anonymous functions that provide a concise way to implement functional interfaces. Introduced in Java 8, they enable functional programming in Java.

The Optional class is a container object that may or may not contain a non-null value. It helps avoid NullPointerException and makes null handling more explicit.


 */

