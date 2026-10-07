# Java 8 & Core Concurrency Notes

This document contains Java 8 features, Stream API code demonstrations, JVM memory architecture, and concurrency concepts compiled from `Java 8/java8/src/StreamDemo.java`.

---

## 1. Java 8 Features Overview

```
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
```

The **Java 8 Stream API** provides a functional approach to process collections of objects, supporting both sequential and parallel data operations.

---

## 2. Stream API Demonstration Code

```java
import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. filter - filters elements based on a condition
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        // Result: [2, 4, 6, 8, 10]

        // 2. map - transforms each element
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        // Result: [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

        // 3. reduce - combines elements into a single value
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        // Result: 55

        // 4. sorted - sorts elements
        List<Integer> sorted = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // 5. distinct - removes duplicate elements
        List<Integer> unique = Arrays.asList(1, 1, 2, 2, 3).stream()
                .distinct()
                .collect(Collectors.toList());
        // Result: [1, 2, 3]

        // 6. limit and skip - pagination and slicing
        List<Integer> limited = numbers.stream()
                .skip(2)
                .limit(5)
                .collect(Collectors.toList());
        // Result: [3, 4, 5, 6, 7]

        // 7. Matching operations
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0); // true
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);  // true

        // 8. Finding elements
        Optional<Integer> first = numbers.stream().findFirst();

        // 9. Aggregation (count)
        long count = numbers.stream().filter(n -> n > 5).count(); // 5

        // 10. Iteration (forEach)
        numbers.stream().forEach(System.out::println);
    }
}
```

---

## 3. Process vs. Thread

| Characteristic | Process | Thread |
| :--- | :--- | :--- |
| **Definition** | An independent executing program with its own memory space | Lightweight unit of execution within a process |
| **Memory** | Has its own address space, heap, stack, and system resources | Shares heap and memory space with other threads in the process; has its own stack |
| **Communication** | Inter-Process Communication (IPC) is expensive | Threads within a process communicate directly |
| **Isolation** | Processes are fully isolated from each other | Shared memory requires synchronization |
| **Context Switching** | Slower context switching | Faster context switching |

---

## 4. JVM Memory Management Areas

The JVM allocates memory into specific functional areas during execution:

```
+-------------------------------------------------------------+
|                        JVM MEMORY                           |
|  +-----------------------+     +-------------------------+  |
|  |     Method Area       |     |       Heap Area         |  |
|  |     (Metaspace)       |     | (Young & Old Gen)       |  |
|  | Shared by all threads |     | Shared by all threads   |  |
|  +-----------------------+     +-------------------------+  |
|                                                             |
|  +-------------------------------------------------------+  |
|  |                     Stack Area                        |  |
|  | Thread 1 Stack  |  Thread 2 Stack  |  Thread 3 Stack  |  |
|  +-------------------------------------------------------+  |
+-------------------------------------------------------------+
```

### 1. Method Area (Metaspace)
- Stores class-level data: class structures, method metadata, and the runtime constant pool.
- **Shared** among all threads.
- Created during JVM startup.

### 2. Heap Area
- Stores all **objects** and their instance variables.
- **Shared** among all threads.
- Managed automatically by the **Garbage Collector (GC)**.
- Divided into **Young Generation** (Eden, Survivor spaces) and **Old Generation**.

### 3. Stack Area
- Created per thread (each thread has its own stack).
- Stores local variables, method calls, and stack frames for method invocations.
- Automatically allocated and deallocated as methods enter and exit.

---

## 5. Concurrency & Java Keywords

### Synchronization & Thread Safety
- **Synchronization**: A mechanism that ensures only one thread can access a shared resource at a time, preventing race conditions and ensuring thread safety.
- **Deadlock**: A situation where two or more threads are blocked forever, each waiting for a lock held by the other.

### Key Keywords

#### `volatile`
- Indicates that a variable's value may be modified by different threads.
- Ensures **visibility** of changes across threads by reading/writing directly to main memory instead of CPU caches.

#### `transient`
- Indicates that a field should **not** be serialized when an object is converted into a byte stream.

### Serialization & Deserialization
- **Serialization**: Converting an object's state into a byte stream.
- **Deserialization**: The reverse process — converting a byte stream back into a live Java object.

---

## 6. Functional Interfaces & Lambdas

### Functional Interface
- An interface that contains **exactly one abstract method**.
- Acts as the target type for Lambda Expressions in Java 8.
- Characteristics:
  - Can have multiple `default` and `static` methods.
  - Can be annotated with `@FunctionalInterface`.

### Built-in Functional Interfaces
- `Predicate<T>`: Represents a boolean-valued function (`T -> boolean`).
- `Consumer<T>`: Represents an operation accepting a single input argument and returning no result (`T -> void`).
- `Supplier<T>`: Represents a supplier of results (`() -> T`).
- `Function<T, R>`: Represents a function accepting one argument and producing a result (`T -> R`).

### Lambda Expressions
- Anonymous functions providing a concise syntax for implementing functional interfaces.

### `Optional` Class
- A container object that may or may not contain a non-null value.
- Designed to eliminate explicit null checks and prevent `NullPointerException`.
