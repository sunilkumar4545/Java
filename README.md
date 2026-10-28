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



# 🎄 Secret Santa: Complete Testing & Postman Guide

This guide answers all your doubts about **testing without setting up MySQL** and provides a step-by-step walkthrough for **testing the entire API in Postman**.

---

## 💡 Question 1: "I haven't created any database in MySQL. How do I test?"

You have **two easy ways** to test:

### ⚡ Method A: Instant 0-Config Testing with In-Memory H2 (Recommended)
You **do NOT need MySQL or any database installed or created** to test right now! We built a ready-to-use in-memory H2 profile into the project:

1. Open PowerShell in `c:\Users\sodis\Downloads\Santa\secret-santa-backend`:
   ```powershell
   mvn spring-boot:run -Dspring-boot.run.profiles=h2
   ```
2. What happens automatically:
   - An in-memory database boots up instantly in RAM with MySQL compatibility mode.
   - All tables (`system_settings`, `users`, `photos`, etc.) are auto-created.
   - Email dispatch is set to **Mock Mode** (`secretsanta.mail.enabled=false`), so emails are printed in your terminal without requiring Gmail app passwords!
   - You can inspect the database visually in your browser at: [http://localhost:8080/h2-console](http://localhost:8080/h2-console) (JDBC URL: `jdbc:h2:mem:secretsanta_db`, User: `sa`, Password: *empty*).

---

### 🐬 Method B: Testing with your Local MySQL 8.0
Your Windows machine **already has MySQL 8.0 installed and running right now** as the Windows service `MySQL80`!

To use your local MySQL:
1. Open PowerShell or Command Prompt:
   ```cmd
   "C:\Program Files\MySQL\MySQL Server 8.0\bin\mysql.exe" -u root -p
   ```
2. Enter your MySQL root password and create the database:
   ```sql
   CREATE DATABASE IF NOT EXISTS secretsanta_db;
   exit;
   ```
3. In `secret-santa-backend\src\main\resources\application.properties`, enter your root password on line 9:
   ```properties
   spring.datasource.password=YOUR_MYSQL_PASSWORD
   ```
4. Start the backend:
   ```powershell
   mvn spring-boot:run
   ```
   *Hibernate will automatically create all tables on first startup!*

---

## 📬 Question 2: "How do I test in Postman?"

We have generated a **ready-to-import Postman Collection** directly in your project:
📁 `c:\Users\sodis\Downloads\Santa\Secret_Santa_API.postman_collection.json`

### 1-Click Import into Postman:
1. Open **Postman**.
2. Click **Import** (top left).
3. Drag & drop `Secret_Santa_API.postman_collection.json` or click **Files** and select it.
4. You will see a folder titled **Secret Santa API (Cozy Winter Wonder)** with all pre-configured endpoints and request bodies!

---

## 🚀 Step-by-Step Testing Flow (Phase 1 → Phase 2 → Phase 3)

### Phase 1: Registration Testing

#### 1. Check System Status & Counter
* **Method**: `GET`
* **URL**: `http://localhost:8080/api/status`
* **Expected Response (200 OK)**:
  ```json
  {
    "success": true,
    "message": "System status retrieved",
    "data": {
      "registrationOpen": true,
      "drawCompleted": false,
      "galleryUnlocked": false,
      "totalJoined": 0,
      "maxParticipants": 32
    }
  }
  ```

#### 2. Register Participants (Run 3+ times to create a pool)
* **Method**: `POST`
* **URL**: `http://localhost:8080/api/register`
* **Headers**: `Content-Type: application/json`
* **Body** (Raw JSON):
  ```json
  {
    "name": "Alice Winter",
    "email": "alice@example.com",
    "phone": "+1 555-0101",
    "address": "102 Pine Crest Way, Aspen CO 81611",
    "wishlist": "Cozy wool socks, dark chocolate, ceramic coffee mug"
  }
  ```
* **Repeat for Bob and Charlie**:
  ```json
  {
    "name": "Bob Evergreen",
    "email": "bob@example.com",
    "phone": "+1 555-0102",
    "address": "404 Snowberry Lane, Seattle WA 98101",
    "wishlist": "Board games, scented winter candles"
  }
  ```
  ```json
  {
    "name": "Charlie Frost",
    "email": "charlie@example.com",
    "phone": "+1 555-0103",
    "address": "77 Snowflake Blvd, Denver CO 80202",
    "wishlist": "Wireless mouse, festive thermos flask"
  }
  ```

#### 3. View Safe Public Roster
* **Method**: `GET`
* **URL**: `http://localhost:8080/api/participants`
* **Notice**: Only `id`, `name`, and `createdAt` are returned. All emails, phone numbers, addresses, and secret matches are completely hidden from the public!

---

### Phase 2: Secret Santa Draw & Match Reveal

#### 4. Trigger Randomized Derangement Draw (Admin)
* **Method**: `POST`
* **URL**: `http://localhost:8080/api/admin/draw`
* **Headers**: 
  * `X-Admin-Key: SantaAdminSecret2026!`
* **Expected Response (200 OK)**:
  ```json
  {
    "success": true,
    "message": "🎉 Secret Santa randomized derangement draw executed successfully!",
    "data": {
      "totalParticipants": 3,
      "status": "DRAW_COMPLETED",
      "timestamp": "2026-10-28T19:20:00"
    }
  }
  ```
* **Behind the scenes**:
  - Sattolo's algorithm creates a circular gifting ring with **0 self-assignments**.
  - Registration is immediately locked (`registrationOpen: false`).
  - Terminal logs mock assignment emails:
    ```
    [MOCK EMAIL] To: alice@example.com (Alice Winter) -> Receiver: Bob Evergreen
    [MOCK EMAIL] To: bob@example.com (Bob Evergreen) -> Receiver: Charlie Frost
    [MOCK EMAIL] To: charlie@example.com (Charlie Frost) -> Receiver: Alice Winter
    ```

#### 5. Verify Registration is Locked
* Try submitting a new registration to `POST /api/register`.
* **Expected Response (400 Bad Request)**:
  ```json
  {
    "success": false,
    "message": "Registration is currently closed!"
  }
  ```

#### 6. Admin Audit: Get Roster & Reveal Tokens
* **Method**: `GET`
* **URL**: `http://localhost:8080/api/admin/participants`
* **Headers**: `X-Admin-Key: SantaAdminSecret2026!`
* Copy the `revealToken` string from one of the participants.

#### 7. Participant Digital Lounge Reveal
* **Method**: `GET`
* **URL**: `http://localhost:8080/api/reveal/{PASTE_REVEAL_TOKEN_HERE}`
* **Expected Response (200 OK)**:
  ```json
  {
    "success": true,
    "message": "Recipient details unwrapped!",
    "data": {
      "giverName": "Alice Winter",
      "receiverName": "Bob Evergreen",
      "receiverAddress": "404 Snowberry Lane, Seattle WA 98101",
      "receiverWishlist": "Board games, scented winter candles"
    }
  }
  ```

---

### Phase 3: Post-Christmas Unboxing Gallery

#### 8. Unlock Gallery (Admin)
* **Method**: `POST`
* **URL**: `http://localhost:8080/api/admin/gallery/unlock`
* **Headers**: `X-Admin-Key: SantaAdminSecret2026!`

#### 9. Upload Unboxing Photo
* **Method**: `POST`
* **URL**: `http://localhost:8080/api/gallery/upload`
* **Body**: `form-data`
  * `userId`: `1`
  * `imageUrl`: `https://images.unsplash.com/photo-1543258103-a62bdc069871?auto=format&fit=crop&w=800&q=80`
  * `caption`: `Unwrapped my Secret Santa gift! Loving this warm holiday mug ❤️☕`

#### 10. Like the Photo (❤️)
* **Method**: `POST`
* **URL**: `http://localhost:8080/api/gallery/1/like?sessionId=user_session_abc`
* **Response**: `{"success": true, "message": "Photo liked ❤️", "data": true}`
* Calling it again toggles it off!

#### 11. Add a Comment & Guess Who Sent It
* **Method**: `POST`
* **URL**: `http://localhost:8080/api/gallery/1/comments`
* **Headers**: `Content-Type: application/json`
* **Body**:
  ```json
  {
    "authorName": "Bob Evergreen",
    "guessedSantaName": "Charlie Frost",
    "commentText": "That mug is awesome! I bet Charlie picked that out! 🎅"
  }
  ```

#### 12. View Full Polaroid Gallery Feed
* **Method**: `GET`
* **URL**: `http://localhost:8080/api/gallery?sessionId=user_session_abc`
* Returns all photos, like counts, `hasLiked: true`, and nested comment threads!

---

## 📋 Summary Table of All Endpoints

| Phase | Method | Endpoint | Auth Header | Description |
| :--- | :--- | :--- | :--- | :--- |
| **1** | `GET` | `/api/status` | None | Live counter & phase status |
| **1** | `POST` | `/api/register` | None | Register new participant |
| **1** | `GET` | `/api/participants` | None | Safe public roster (names only) |
| **2** | `POST` | `/api/admin/draw` | `X-Admin-Key` | Run randomized derangement draw |
| **2** | `GET` | `/api/admin/participants`| `X-Admin-Key` | Full roster with reveal tokens |
| **2** | `GET` | `/api/reveal/{token}` | None | Participant scratch reveal card |
| **2** | `POST` | `/api/admin/resend-email/{id}`| `X-Admin-Key` | Resend individual assignment email |
| **3** | `POST` | `/api/admin/gallery/unlock`| `X-Admin-Key` | Unlock gallery after Christmas |
| **3** | `GET` | `/api/gallery` | None | Polaroid feed with likes & comments |
| **3** | `POST` | `/api/gallery/upload` | None | Upload unboxing photo |
| **3** | `POST` | `/api/gallery/{id}/like` | None | Toggle heart like (❤️) |
| **3** | `POST` | `/api/gallery/{id}/comments` | None | Comment & Santa guess |

---

## 🎯 Quick Command to Start Testing Right Now:

Open a terminal and run:
```powershell
cd c:\Users\sodis\Downloads\Santa\secret-santa-backend
mvn spring-boot:run -Dspring-boot.run.profiles=h2
```
Then import [Secret_Santa_API.postman_collection.json](file:///c:/Users/sodis/Downloads/Santa/Secret_Santa_API.postman_collection.json) into Postman and start testing!
