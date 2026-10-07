/*
The Java Collections Framework is a set of interfaces and classes provided by Java
to store, manipulate, and process groups of objects efficiently.

Collection → An interface.
Collections → A utility class containing static helper methods.

ArrayList → ordered list
HashSet   → unique items
HashMap   → key → value
Queue     → waiting line

Collection → stores individual elements
Map        → stores key + value

                 Iterable
                    │
               Collection
                    │
        ┌───────────┼───────────┐
        │           │           │
       List         Set        Queue
        │           │           │
   ArrayList     HashSet    PriorityQueue
   LinkedList    LinkedHashSet
   Vector        TreeSet


                 Map
                  │
        ┌─────────┼─────────┐
        │         │         │
     HashMap   LinkedHashMap TreeMap

List →   elements in a sequence, Duplicates allowed, Insertion order
List <Integer> employeeIds = new ArrayList<>();
employeeIds.add(101);
employeeIds.add(102);
employeeIds.add(101);
employeeIds.add(103);
                        → [101, 102, 101, 103]
ArrayList:
        List       → interface
        ArrayList  → implementation
List<String> employees = new ArrayList<>();
ArrayList dynamically grows its internal array when capacity is insufficient.
fast in get operation (indexes)
slow for inserting/deleting in the middle because items must shift.


LinkedList:
Doubly linked nodes. Fast for frequent insertions/deletions at the ends, but slower for searching by index.
LinkedList is better for manipulating data.
LinkedList<String> linkedList = new LinkedList<>();


Vector:
Introduced in Java 1.0, every method in Vector is synchronized (thread-safe).
Because of the performance cost of synchronization on every operation,
it is considered legacy, and ArrayList is used instead.
Vector<String> vector = new Vector<>();
Vector increments 100% means doubles the array size if total number of element exceeds than its capacity.

Stack:
A subclass of Vector that represents a Last-In, First-Out (LIFO) stack.
It adds stack-specific operations (push, pop, peek, search) on top of vector behavior.
Modern Java recommends using ArrayDeque or LinkedList instead of Stack.

set  →   unique elements
Set<Integer> ids = new HashSet<>();
ids.add(101);
ids.add(102);
ids.add(103);
ids.add(102);
ids.add(101);
 equals() + hashCode()

HashSet:
Set<String> hashSet = new HashSet<>();
hashing algorithm
Allows one null element.
Unpredictable / random order.
When you need maximum speed for checking existence or eliminating duplicates, and order does not matter at all.


LinkedHashSet:
Set<String> linkedHashSet = new LinkedHashSet<>();
Extends HashSet, but maintains a doubly linked list running across all entries to preserve insertion order.
Allows one null element.
When you need fast unique lookups and need to iterate elements in the exact order they were inserted.

TreeSet:
Set<String> treeSet = new TreeSet<>();
Automatically sorted in Natural Ascending Order.
No null allowed
When you need unique items maintained in sorted order at all times.


Queue →  waiting-line structure
Queue always means FIFO. Elements are added at the rear and removed from the front.

PriorityQueue: → Priority first
Queue<Integer> numbers = new PriorityQueue<>();
orders elements based on their priority rather than strictly following FIFO order.
By default, it uses the natural ordering of elements, so the smallest element has the highest priority.

Map →    key → value
A Map is not part of the Collection hierarchy.
Map<Integer, String> employees = new HashMap<>();
Keys → unique
Values → duplicates allowed
If you insert an existing key with a new value, it overwrites the old value.

Map
 ├── HashMap
 ├── LinkedHashMap
 └── TreeMap

 HashMap:
 HashMap is a Map implementation that stores key-value pairs using hashing.
 It allows one null key and multiple null values, does not guarantee iteration order
Map<Integer, String> employees = new HashMap<>();
Each entry stored in a bucket isn't just a value; it's a Node containing 4 things:
hash (calculated hash code)
key
value
next (pointer to the next node in case of collisions)

LinkedHashMap:
Extends HashMap, but adds a doubly-linked list across all entries, Insertion Order.

TreeMap:
Keys are maintained strictly in Natural Ascending Order.
No null keys allowed

ConcurrentHashMap:
Uses bucket-level locking, rather than locking the entire map.
need multi-threaded safety in production
 */

/*
Collections is a utility class in Java that provides static methods for performing common operations on
collection objects, such as sorting, searching, reversing, shuffling, and finding minimum or maximum elements.

import java.util.Collections;

Collections.sort(list);

Collections.reverse(list);

Collections.shuffle(list);

Collections.min(list);

Collections.max(list);

Collections.frequency(list, value);

Collections.swap(list, i, j);

Collections.binarySearch(list, key);

Collections.fill(list, value);

Collections.unmodifiableList(list);
 */