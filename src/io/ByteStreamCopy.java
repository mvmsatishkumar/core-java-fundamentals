package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class ByteStreamCopy {
    public static void main(String[] args) throws Exception {
        byte[] input = "Java I/O".getBytes(StandardCharsets.UTF_8);

        try (ByteArrayInputStream in = new ByteArrayInputStream(input);
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println(out.toString(StandardCharsets.UTF_8));
        }
    }
}
// Interview point: byte streams handle raw binary data; character streams are designed for text.
