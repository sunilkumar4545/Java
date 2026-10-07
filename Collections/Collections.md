# Java Collections Framework Notes

This document contains detailed information, diagrams, and explanations of the Java Collections Framework compiled from `Collections/Collections/src/Main.java`.

---

## 1. Overview of Java Collections Framework

The **Java Collections Framework** is a set of interfaces and classes provided by Java to store, manipulate, and process groups of objects efficiently.

### Key Distinction: Collection vs. Collections
- **`Collection`**: An **interface** that represents a single root interface in the hierarchy (for `List`, `Set`, and `Queue`).
- **`Collections`**: A **utility class** (`java.util.Collections`) containing static helper methods (like sorting, searching, reversing, etc.).

### Quick Summary of Key Implementations
| Collection | Characteristics |
| :--- | :--- |
| **`ArrayList`** | Ordered list, index-based fast lookups |
| **`HashSet`** | Unique items, unordered |
| **`HashMap`** | Key-Value mapping |
| **`Queue`** | Waiting-line structure (FIFO / Priority) |

- **`Collection` interface**: Stores individual elements.
- **`Map` interface**: Stores key-value pairs (`key -> value`).

---

## 2. Collection Framework Hierarchy

```
                 Iterable
                    │
               Collection
                    │
        ┌───────────┼───────────┐
        │           │           │
       List        Set        Queue
        │           │           │
   ArrayList     HashSet    PriorityQueue
   LinkedList    LinkedHashSet
   Vector        TreeSet
```

### Map Hierarchy (Separate from Collection)
```
                 Map
                  │
        ┌─────────┼─────────┐
        │         │         │
     HashMap   LinkedHashMap TreeMap
```

---

## 3. List Interface

**Properties of `List`:**
- Stores elements in a sequence.
- **Duplicates are allowed**.
- Preserves **insertion order**.

```java
List<Integer> employeeIds = new ArrayList<>();
employeeIds.add(101);
employeeIds.add(102);
employeeIds.add(101);
employeeIds.add(103);
// Result: [101, 102, 101, 103]
```

### List Implementations

#### 1. `ArrayList`
- `List` is the interface; `ArrayList` is the implementation.
- Dynamically grows its internal array when capacity is exceeded.
- **Fast** `get(index)` operations due to direct index access.
- **Slow** for insertions/deletions in the middle because elements must be shifted.

```java
List<String> employees = new ArrayList<>();
```

#### 2. `LinkedList`
- Implemented as **doubly linked nodes**.
- **Fast** for frequent insertions and deletions (especially at ends).
- **Slower** for searching by index compared to `ArrayList`.
- Better choice when heavily manipulating data.

```java
LinkedList<String> linkedList = new LinkedList<>();
```

#### 3. `Vector`
- Introduced in Java 1.0. Every method in `Vector` is **synchronized** (thread-safe).
- High performance cost due to synchronization on every operation; considered **legacy**. `ArrayList` is preferred in single-threaded contexts.
- Capacity growth: Doubles its array size (100% growth) when capacity is exceeded.

```java
Vector<String> vector = new Vector<>();
```

#### 4. `Stack`
- A subclass of `Vector` representing a **Last-In, First-Out (LIFO)** stack.
- Adds stack-specific methods: `push()`, `pop()`, `peek()`, `search()`.
- Modern Java recommends using `ArrayDeque` or `LinkedList` instead of `Stack`.

---

## 4. Set Interface

**Properties of `Set`:**
- Stores **unique elements** (no duplicates).
- Relies on `equals()` and `hashCode()` for uniqueness checks.

```java
Set<Integer> ids = new HashSet<>();
ids.add(101);
ids.add(102);
ids.add(103);
ids.add(102); // Duplicate ignored
ids.add(101); // Duplicate ignored
```

### Set Implementations

#### 1. `HashSet`
- Uses a **hashing algorithm**.
- Allows **one null element**.
- Does **not** guarantee any iteration order (unpredictable/random order).
- Use case: Maximum speed for existence checks or duplicate removal when order does not matter.

```java
Set<String> hashSet = new HashSet<>();
```

#### 2. `LinkedHashSet`
- Extends `HashSet` and maintains a **doubly linked list** across all entries to preserve **insertion order**.
- Allows **one null element**.
- Use case: Fast unique lookups with fixed iteration order matching insertion.

```java
Set<String> linkedHashSet = new LinkedHashSet<>();
```

#### 3. `TreeSet`
- Elements are automatically sorted in **Natural Ascending Order** (or using a `Comparator`).
- **No null elements allowed**.
- Use case: Maintaining unique elements in sorted order at all times.

```java
Set<String> treeSet = new TreeSet<>();
```

---

## 5. Queue Interface

**Properties of `Queue`:**
- Waiting-line structure operating on **First-In, First-Out (FIFO)** principles by default.
- Elements added at the rear and removed from the front.

### `PriorityQueue`
- Orders elements based on **priority** rather than strict FIFO.
- By default, uses **natural ordering** (smallest element has the highest priority).

```java
Queue<Integer> numbers = new PriorityQueue<>();
```

---

## 6. Map Interface

**Properties of `Map`:**
- Maps unique **keys** to **values**.
- **Not** part of the `Collection` interface hierarchy.
- **Keys**: Must be unique.
- **Values**: Duplicates are allowed.
- Inserting an existing key with a new value overwrites the old value.

```
Map
 ├── HashMap
 ├── LinkedHashMap
 └── TreeMap
```

### Map Implementations

#### 1. `HashMap`
- Stores key-value pairs using hashing.
- Allows **one null key** and **multiple null values**.
- Does not guarantee iteration order.
- **Internal Node Structure**: Each entry in a bucket contains 4 fields:
  1. `hash` (calculated hash code)
  2. `key`
  3. `value`
  4. `next` (pointer to next node for collision resolution)

```java
Map<Integer, String> employees = new HashMap<>();
```

#### 2. `LinkedHashMap`
- Extends `HashMap` with a doubly linked list to preserve **Insertion Order**.

#### 3. `TreeMap`
- Keys are strictly maintained in **Natural Ascending Order**.
- **No null keys allowed**.

#### 4. `ConcurrentHashMap`
- Thread-safe Map designed for production multi-threaded applications.
- Uses **bucket-level locking** (segment locking / CAS operations) rather than locking the entire map.

---

## 7. `Collections` Utility Class

The `java.util.Collections` class provides static utility methods for operating on collections:

```java
import java.util.Collections;

// Sorts a list in natural ascending order
Collections.sort(list);

// Reverses the order of elements in a list
Collections.reverse(list);

// Randomly permutes the list
Collections.shuffle(list);

// Finds the minimum element
Collections.min(list);

// Finds the maximum element
Collections.max(list);

// Returns the count of occurrences of a value
Collections.frequency(list, value);

// Swaps elements at indices i and j
Collections.swap(list, i, j);

// Performs binary search on a sorted list
Collections.binarySearch(list, key);

// Replaces all elements with a specified value
Collections.fill(list, value);

// Returns an unmodifiable view of the specified list
Collections.unmodifiableList(list);
```
