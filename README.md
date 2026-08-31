# Core Java Practice

A structured Java reference repository covering the language fundamentals, object-oriented programming, Collections Framework, modern Java features, Streams, I/O, concurrency, JVM concepts, and commonly used design patterns.

The repository is organized as a progression from language fundamentals to advanced Core Java concepts, with focused, runnable examples for each area.

## Technical Coverage

### Java Fundamentals
- Variables, primitive and reference types
- Operators, conditionals, loops, arrays, and methods
- Console input and output
- Type casting and conversions
- Strings, `StringBuilder`, `StringBuffer`, and the String Pool

### Object-Oriented Programming
- Classes and objects
- Constructors
- Encapsulation and access modifiers
- Inheritance and composition
- Method overloading and overriding
- Runtime polymorphism
- Abstract classes and interfaces
- Interface hierarchies
- Immutability and copy semantics

### Exception Handling
- Checked and unchecked exceptions
- `try`, `catch`, `finally`
- Multiple-catch
- `throw` and `throws`
- Custom exceptions
- Exception propagation
- Try-with-resources

### Collections Framework
- `List`, `Set`, `Map`, `Queue`, and `Deque`
- `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`
- `HashMap`, `TreeMap`, and related map operations
- Iterators and collection utilities
- `Comparable` and `Comparator`
- `equals()` and `hashCode()`
- Generics and wildcard bounds
- Common collection behavior and interview edge cases

### Modern Java
- Lambda expressions
- Functional interfaces
- Method references
- Default and static interface methods
- `Optional`
- Wrapper classes and enums
- Date and Time API
- Regular expressions

### Stream API
- Stream creation and pipelines
- `filter`, `map`, `flatMap`, `sorted`, `distinct`
- `limit`, `skip`, and short-circuiting operations
- `reduce`, `min`, `max`, and matching operations
- Collectors
- Grouping and partitioning
- `toMap` and duplicate-key handling
- Primitive streams
- Lazy evaluation and stream lifecycle

### I/O
- File handling
- Byte streams
- Character streams
- Serialization
- NIO `Path` / `Files`
- Resource management

### Concurrency
- Threads and `Runnable`
- `Callable` and `Future`
- Thread lifecycle and interruption
- `start()` vs `run()`
- Synchronization and race conditions
- `volatile`
- Locks and `ReentrantLock`
- `wait()` / `notify()` / `notifyAll()`
- Executor services
- `ConcurrentHashMap`
- Atomic variables
- Deadlock fundamentals and prevention

### JVM & References
- JVM memory concepts
- Stack and heap
- Class loading
- Garbage collection fundamentals
- Strong, soft, weak, and phantom references

### Design Patterns
- Singleton
- Factory
- Builder
- Strategy

### Algorithms
A separate section contains fundamental sorting implementations for algorithmic practice.

## Repository Structure

```text
src/
├── basics/
├── strings/
├── oop/
├── exceptionhandling/
├── collections/
├── generics/
├── java8/
├── streams/
├── io/
├── concurrency/
├── references/
├── jvm/
├── designpatterns/
└── algorithms/
```

Each major directory groups related concepts, while individual Java files provide focused implementations and examples.

## Approach

The examples emphasize clear Java syntax, standard APIs, practical implementation patterns, and edge cases that commonly arise when working with Core Java.

Where a concept has an important behavioral distinction or common pitfall, the relevant example includes a concise code-level note so the repository can also serve as a quick technical reference.

## Tech Stack

- **Language:** Java
- **Build/IDE:** Maven / IntelliJ IDEA
- **Core APIs:** Java Collections, Streams, I/O, Concurrency, Date-Time, JVM fundamentals

## Purpose

This repository serves as a consolidated Core Java reference for building a strong foundation for Java backend development and for revisiting language and API concepts while working on larger backend systems.
