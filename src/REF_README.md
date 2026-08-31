# Core Java Practice

A hands-on, interview-oriented Core Java reference covering Java fundamentals, OOP, Collections, Java 8+, Streams, I/O, Concurrency, JVM concepts, references, and selected design patterns.

The repository is intentionally built as **executable revision material**: each example is small, runnable, and includes concise comments for interview traps, API details, and common misconceptions.

## Coverage

| Area | Topics |
|---|---|
| Basics | Input, data types, operators, conditionals, loops, arrays, methods, casting |
| Strings | String API, pool, immutability, StringBuilder, StringBuffer |
| OOP | Classes, constructors, encapsulation, inheritance, polymorphism, abstraction, interfaces, composition |
| Exceptions | try/catch, multiple catch, finally, checked vs unchecked, throw/throws, custom exceptions |
| Collections | List, Set, Map, Queue, Deque, Iterators, Comparable/Comparator |
| Java Language | Generics, wrappers, enums |
| Java 8+ | Lambdas, functional interfaces, method references, Optional, default methods |
| Streams | Intermediate/terminal operations, reduce, collectors, grouping, partitioning, primitive streams |
| APIs | Date/Time, Regex, File I/O, byte/character streams, serialization |
| Concurrency | Threads, Runnable, Callable/Future, synchronization, locks, volatile, executors, concurrent collections, atomics |
| JVM | Memory model basics, GC, class lifecycle |
| References | Strong, weak, soft, phantom references; equals/hashCode |
| Design Patterns | Singleton, Builder, Factory, Strategy |
| Algorithms | Existing sorting implementations kept as supporting Java practice |

## Interview-first conventions

- Prefer one focused example per concept over large demo programs.
- Comments explain **why something matters**, not obvious syntax.
- Tricky interview cases are demonstrated directly in code where useful.
- Examples are designed to be easy to open and revise before an interview.

## Suggested revision order

**Basics → Strings → OOP → Exceptions → Collections → Generics/Java 8+ → Streams → I/O/Date-Time → Concurrency → JVM/References → Design Patterns**

## High-value interview traps covered

- Java pass-by-value and mutable object references
- Immutability and defensive-copy considerations
- Shallow vs deep copy and `clone()` caveats
- `final` vs `finally` vs deprecated `finalize()`
- `equals()` / `hashCode()` and mutable `HashMap` keys
- `HashMap` collision/treeification as an implementation detail
- `Arrays.asList()` fixed-size behavior
- Generic wildcards and PECS
- Stream laziness, reuse, short-circuiting, and `map()` vs `flatMap()`
- Try-with-resources and resource-closing order
- `wait()` / `notifyAll()` monitor rules
- Deadlock conditions and prevention
- `start()` vs `run()`, `sleep()` vs `wait()`, and interruption
