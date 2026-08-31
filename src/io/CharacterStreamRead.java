package io;

import java.io.StringReader;

public class CharacterStreamRead {
    public static void main(String[] args) throws Exception {
        try (StringReader reader = new StringReader("Java")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }
}
// Interview point: Reader/Writer APIs work with characters and are generally preferred for text.
