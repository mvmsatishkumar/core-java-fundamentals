package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("example.txt");

        Files.writeString(path, "Java world this is new programming",
        		StandardOpenOption.CREATE,  // Create if absent
        		StandardOpenOption.APPEND);
        
        String content = Files.readString(path);

        System.out.println(content);
        Files.deleteIfExists(path);
    }
}
// Interview question: java.nio.file.Path/Files provide modern, concise file APIs compared with many legacy java.io patterns.
