# Java File Handling — Interview Reference

## 📌 Topics Covered

### 1. Java I/O Fundamentals

* What is File Handling?
* Input vs Output
* `java.io` vs `java.nio.file`
* Files and Directories
* `File` vs `Path`
* `Path` vs `Files`

### 2. Byte Streams

* `InputStream`
* `OutputStream`
* `FileInputStream`
* `FileOutputStream`
* Reading and writing binary data
* Buffered byte streams
* Binary file copying

**Typical use cases:**

* Images
* PDFs
* Videos
* Audio
* ZIP files
* Other binary data

### 3. Character Streams

* `Reader`
* `Writer`
* `FileReader`
* `FileWriter`
* Reading and writing text files
* Character encoding
* `BufferedReader`
* `BufferedWriter`

### 4. Buffered I/O

* Why buffering is required
* `BufferedReader`
* `BufferedWriter`
* `BufferedInputStream`
* `BufferedOutputStream`
* `readLine()`
* `flush()` vs `close()`

### 5. Resource Management & Exceptions

* Try-with-resources
* `AutoCloseable`
* `Closeable`
* `IOException`
* `FileNotFoundException`
* Proper resource cleanup

### 6. NIO File Operations

Using `Path` and `Files`:

* Create files
* Create directories
* Read files
* Write files
* Append data
* Copy files
* Move files
* Delete files
* Check file existence
* File metadata
* Directory listing
* Directory traversal

### 7. Large File Processing

* Why loading an entire file into memory can be problematic
* Line-by-line processing
* `BufferedReader`
* `Files.lines()`
* Incremental processing

### 8. Backend File Handling

Practical backend applications:

* JSON files
* CSV files
* Properties/configuration files
* Application log files
* File uploads
* Multipart files
* Local file storage
* Object storage concepts

### 9. JSON File Handling

Understanding the separation between:

```text
File I/O
   +
JSON Serialization / Deserialization
```

Using Jackson:

```text
JSON File
   ↓
Files / Reader
   ↓
JSON
   ↓
ObjectMapper
   ↓
Java Object
```

And:

```text
Java Object
   ↓
ObjectMapper
   ↓
JSON
   ↓
Files / Writer
   ↓
JSON File
```

### 10. Interview Questions

The reference covers the most relevant interview questions:

1. What is file handling in Java?
2. What are byte streams?
3. What are character streams?
4. `InputStream` vs `OutputStream`
5. `Reader` vs `Writer`
6. Byte streams vs character streams
7. `FileInputStream` vs `FileReader`
8. `FileOutputStream` vs `FileWriter`
9. Why use `BufferedReader`?
10. What is `readLine()`?
11. Why does `read()` return `-1`?
12. What is try-with-resources?
13. What is `IOException`?
14. `File` vs `Path`
15. `Path` vs `Files`
16. How do you read a text file?
17. How do you write to a file?
18. How do you append to a file?
19. How do you copy, move, and delete files?
20. How would you process a large file?

---

## 🔹 Core I/O Hierarchy

```text
                 Java I/O
                    │
          ┌─────────┴─────────┐
          │                   │
     Byte Streams        Character Streams
          │                   │
    ┌─────┴─────┐       ┌─────┴─────┐
    │           │       │           │
InputStream OutputStream Reader      Writer
    │           │       │           │
FileInput    FileOutput FileReader FileWriter
Stream       Stream
    │           │       │           │
Buffered     Buffered   Buffered    Buffered
InputStream  OutputStream Reader     Writer
```

---

## 🔹 Modern NIO

```text
java.nio.file
      │
  ┌───┴────┐
  │        │
 Path    Files
  │        │
WHERE?   OPERATIONS
```

Example:

```java
Path path = Path.of("data.txt");

Files.writeString(path, "Hello Java");

String content = Files.readString(path);
```

---

## 🔹 Reading a Text File

For a small file:

```java
String content =
        Files.readString(Path.of("data.txt"));
```

For line-by-line processing:

```java
try (BufferedReader reader =
         Files.newBufferedReader(Path.of("data.txt"))) {

    String line;

    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }

} catch (IOException e) {
    e.printStackTrace();
}
```

---

## 🔹 Writing to a File

```java
Files.writeString(
    Path.of("data.txt"),
    "Hello Java"
);
```

For repeated/controlled writes:

```java
try (BufferedWriter writer =
         Files.newBufferedWriter(Path.of("data.txt"))) {

    writer.write("Hello Java");
    writer.newLine();
    writer.write("Spring Boot");

} catch (IOException e) {
    e.printStackTrace();
}
```

---

## 🔹 Appending to a File

```java
Files.writeString(
    Path.of("log.txt"),
    "New log entry\n",
    StandardOpenOption.CREATE,
    StandardOpenOption.APPEND
);
```

---

## 🔹 Binary File Copy

```java
try (
    InputStream input =
        new FileInputStream("source.jpg");

    OutputStream output =
        new FileOutputStream("copy.jpg")
) {

    byte[] buffer = new byte[8192];

    int bytesRead;

    while ((bytesRead = input.read(buffer)) != -1) {
        output.write(buffer, 0, bytesRead);
    }

} catch (IOException e) {
    e.printStackTrace();
}
```

Modern NIO alternative:

```java
Files.copy(
    Path.of("source.jpg"),
    Path.of("copy.jpg"),
    StandardCopyOption.REPLACE_EXISTING
);
```

---

## 🔹 Large File Processing

Avoid loading very large files completely into memory.

Instead:

```java
try (BufferedReader reader =
         Files.newBufferedReader(Path.of("application.log"))) {

    String line;

    while ((line = reader.readLine()) != null) {
        process(line);
    }

} catch (IOException e) {
    e.printStackTrace();
}
```

### Key Principle

```text
Small file
    ↓
readString() / readAllLines()

Large file
    ↓
BufferedReader / Files.lines()
    ↓
Process incrementally
```

---

## 🔹 JSON File Handling

File I/O and JSON processing are separate responsibilities.

```java
Path path = Path.of("employee.json");

String json = Files.readString(path);

Employee employee =
        objectMapper.readValue(
            json,
            Employee.class
        );
```

### Object → JSON File

```java
objectMapper.writeValue(
    Path.of("employee.json").toFile(),
    employee
);
```

### Responsibility Separation

```text
Files / Reader / Writer
        ↓
     File I/O

Jackson ObjectMapper
        ↓
JSON Serialization
        ↓
Java Object
```

---

## 🔹 Backend File Uploads

A Spring Boot application can receive uploaded files through `MultipartFile`.

```java
@PostMapping("/upload")
public String upload(
        @RequestParam("file") MultipartFile file) {

    Path destination =
        Path.of("uploads", file.getOriginalFilename());

    try {
        Files.copy(
            file.getInputStream(),
            destination,
            StandardCopyOption.REPLACE_EXISTING
        );

        return "Uploaded successfully";

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

### Production Considerations

For real applications, consider:

* Filename validation
* Path traversal protection
* File size limits
* Content-type validation
* Storage location
* Unique filenames
* Local disk vs object storage
* Access control

---

## 🎯 Interview Priority

### Must Know

* Byte vs character streams
* `InputStream` / `OutputStream`
* `Reader` / `Writer`
* `BufferedReader`
* `read()` and EOF
* Try-with-resources
* `IOException`
* `File` vs `Path`
* `Path` vs `Files`
* Reading/writing/appending
* Large-file processing

### Backend-Relevant

* JSON file handling
* Jackson
* File uploads
* Multipart files
* Configuration files
* Log files
* Local vs object storage

### Know Conceptually

* `Serializable`
* `ObjectInputStream`
* `ObjectOutputStream`
* `transient`
* `RandomAccessFile`
* CSV processing
* File attributes
* Directory traversal

---

## 🧠 Core Mental Model

```text
                    FILE HANDLING
                         │
             ┌───────────┴───────────┐
             │                       │
         java.io                java.nio.file
             │                       │
         Streams                 Path + Files
             │
      ┌──────┴──────┐
      │             │
    Bytes         Characters
      │             │
 InputStream      Reader
 OutputStream     Writer
      │             │
 FileInputStream  FileReader
 FileOutputStream FileWriter
      │             │
 Buffered...      Buffered...
```

### Backend Extension

```text
File
 │
 ├── Text
 │    └── Reader / Writer
 │
 ├── Binary
 │    └── InputStream / OutputStream
 │
 ├── JSON
 │    └── Files + Jackson
 │
 ├── CSV
 │    └── Files + CSV parser
 │
 ├── Logs
 │    └── Logging framework
 │
 └── Uploads
      └── MultipartFile → Storage
```

---

## Key Takeaway

For a Java backend interview, the important progression is:

```text
File Handling
     ↓
Byte vs Character Streams
     ↓
Buffered I/O
     ↓
Try-With-Resources
     ↓
IOException
     ↓
Path + Files (NIO)
     ↓
Large File Processing
     ↓
JSON / CSV / Configuration
     ↓
File Uploads & Backend Storage
```
