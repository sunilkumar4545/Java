# Java Basics Notes

This document contains Java basic concepts, code implementations, and explanatory notes compiled from `Basics/Day 0/src/com/JAVAoneShot/Main.java`.

---

## 1. Introduction & Main Method

Java applications start execution from the `main` method within a class.

```java
package com.JAVAoneShot;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // METHODS
    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
```

---

## 2. Variables & Java Data Types

A variable is a container that holds values during program execution.

```java
// Variable initialization & assignment
String neighbor = "Sunil Kumar";
String Friend = neighbor;
```

### Data Types Overview

Java provides two categories of data types:

1. **Primitive Data Types**
2. **Non-Primitive Data Types**

### 1. Primitive Data Types
Primitive data types store simple values directly in memory.

| Data Type | Size (Bytes) | Range / Values |
| :--- | :--- | :--- |
| `byte` | 1 byte | -128 to 127 |
| `short` | 2 bytes | -32,768 to 32,767 |
| `int` | 4 bytes | -2^31 to 2^31 - 1 |
| `long` | 8 bytes | Requires `L` suffix (e.g., `12345678900L`) |
| `float` | 4 bytes | Requires `F` suffix (e.g., `3.14F`) |
| `double` | 8 bytes | Floating point numbers |
| `char` | 2 bytes | Single Unicode character (e.g., `'@'`) |
| `boolean` | 1 byte | `true` or `false` |

```java
byte bit = 27;
int phone1 = 1234567890;
long phone2 = 12345678900L;
float pi = 3.14F;
char letter = '@';
boolean IsAdult = true;
```

### 2. Non-Primitive (Reference) Data Types
Non-primitive types refer to objects and are created by the user or Java standard library.

```java
String name = "Samantha";
String friend1 = new String("Zar ");
```

---

## 3. String Manipulation

Strings in Java are immutable sequences of characters with built-in utility methods.

```java
// Length of a String
System.out.println(name.length());

// String Concatenation
String name2 = "Evilon";
String name3 = name + " And " + name2;
System.out.println(name3); // Samantha And Evilon

// charAt - Access character at specific index
System.out.println(name.charAt(0)); // 'S'

// replace - Replace characters
String replace = name.replace('S', 'E');
System.out.println(replace); // Eamantha

// substring - Extract sub-portion (startIndex, endIndex)
String name4 = "SUMI and Evilon";
System.out.println(name4.substring(5, 8)); // "and"
```

---

## 4. Arrays

Arrays are fixed-size structures that store multiple values of the same type.

### 1. Unidimensional Arrays

```java
int[] marks = {97, 98, 99};

System.out.println(marks[0]); // 97
System.out.println(marks[1]); // 98
System.out.println(marks[2]); // 99

// Array Length
System.out.println(marks.length); // 3

// Sorting an Array
Arrays.sort(marks);
System.out.println(marks[0]);
```

### 2. Multidimensional Arrays

```java
// 2D Array: Rows x Columns
int[][] finalmarks = {{97, 98, 95}, {95, 95, 98}};
System.out.println(finalmarks[1][1]); // 95
```

---

## 5. Type Casting

Casting is converting one data type into another.

```java
// Implicit Casting (Automatic conversion: smaller type -> larger type)
double price = 100.00;
double finalPrice = price + 18.5; // 118.5
System.out.println(finalPrice);

// Explicit Casting (Manual conversion: larger type -> smaller type)
int P = 100;
int FP = P + (int) 18.5; // 118
System.out.println(FP);
```

---

## 6. Constants

Use the `final` keyword to declare read-only variables whose values cannot be changed.

```java
final float PI = 3.142F;
```

---

## 7. Operators

### 1. Arithmetic Operators

```java
double a = 5;
double b = 3;

double sum = a + b;       // 8.0
double sub = a - b;       // 2.0
double mul = a * b;       // 15.0
double div = a / b;       // 1.6666666666666667
double modulus = a % b;   // 2.0
```

### 2. Unary Operators (Increment & Decrement)

```java
int[] num = {1, 1, 1, 1};

// Pre-Increment (++x): Increments first, then evaluates
System.out.println(++num[1]); // 2
System.out.println(num[1]);    // 2

// Post-Increment (x++): Evaluates first, then increments
System.out.println(num[2]++); // 1
System.out.println(num[2]);    // 2

// Pre-Decrement (--x): Decrements first, then evaluates
System.out.println(--num[3]); // 0
System.out.println(num[3]);    // 0

// Post-Decrement (x--): Evaluates first, then decrements
System.out.println(num[0]--); // 1
System.out.println(num[0]);    // 0
```

### 3. Comparison Operators

- `a == b` (Equal to)
- `a != b` (Not equal to)
- `a < b` (Less than)
- `a > b` (Greater than)
- `a >= b` (Greater than or equal to)
- `a <= b` (Less than or equal to)

### 4. Logical Operators

```java
int p = 30;
int q = 40;

// Logical AND (&&): True if both conditions are true
if (p < 50 && q < 50) {
    System.out.println("both are less than 50");
}

// Logical OR (||): True if at least one condition is true
if (p < 50 || q < 50) {
    System.out.println("Atleast one is less than 50");
}

// Logical NOT (!): Inverts boolean value
boolean isAdult = false;
if (!isAdult) {
    System.out.println("is Adult");
} else {
    System.out.println("not Adult");
}
```

---

## 8. Math Class Utilities

```java
System.out.println(Math.max(2, 3)); // 3
System.out.println(Math.min(2, 3)); // 2

// Generating a random integer between 1 and 100
System.out.println((int)(Math.random() * 100));
```

---

## 9. User Input (Scanner)

```java
Scanner sc = new Scanner(System.in);

// Inputting float
System.out.print("Input your Age: ");
float age = sc.nextFloat();
System.out.println(age);

// Inputting String (single word / token)
System.out.print("Input your Name: ");
String name5 = sc.next();
System.out.println(name5);
```

---

## 10. Conditional Statements

### If-Else Ladder Example

```java
// Cash check example
System.out.print("Enter Cash Amount: ");
int cash = sc.nextInt();

if (cash <= 10) {
    System.out.println("Cannot buy Anything");
    System.out.println("Get more Cash");
} else if (cash < 50) {
    System.out.println("can get only one thing");
} else {
    System.out.println("Can get both");
}
```

### Switch Case Statement

```java
System.out.print("Enter Number corresponding to days: ");
int day = sc.nextInt();
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    default:
        System.out.println("Sunday");
}
```

---

## 11. Loops

### For Loop

```java
// Forward for loop
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}

// Backward for loop
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

### While Loop

```java
int j = 10;
while (j >= 1) {
    System.out.println(j);
    j--;
}
```

### Do-While Loop

```java
int k = 100;
do {
    System.out.println(k);
    k--;
} while (k >= 1);
```

---

## 12. Break and Continue

- `continue`: Skips the rest of the current loop iteration and moves to the next iteration.
- `break`: Immediately exits the enclosing loop.

```java
int i = 0;
while (true) {
    if (i == 3) {
        i++;
        continue; // skip printing 3
    }
    System.out.println(i);
    i++;
    if (i > 5) {
        break; // terminate loop when i > 5
    }
}
```

---

## 13. Exception Handling (Try & Catch)

Exception handling prevents application crash during runtime errors.

```java
try {
    System.out.println(marks[5]); // May throw ArrayIndexOutOfBoundsException
} catch (Exception exception) {
    // Handling exception gracefully
    System.out.println("An exception occurred!");
}
System.out.println("Exception Handling works like this");
```

---

## 14. Methods / Functions

Methods package logic into reusable blocks.

```java
public static void printJava() {
    System.out.println("Hello Java");
}
```

---

## 15. Mini Project: Number Guessing Game

```java
Scanner myNum = new Scanner(System.in);
int myNumber = (int)(Math.random() * 100); // Random integer 1-100
int usernumber = 0;

do {
    System.out.print("Guess my number: ");
    usernumber = sc.nextInt();
    if (usernumber == myNumber) {
        System.out.println("WOOHO....CORRECT NUMBER!!!");
        break;
    } else if (usernumber > myNumber) {
        System.out.println("Your number is too Large");
    } else {
        System.out.println("Your number is too Small");
    }
} while (usernumber >= 0);

System.out.println("My number was: " + myNumber);
```
