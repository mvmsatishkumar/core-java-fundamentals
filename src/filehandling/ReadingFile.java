package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("data.txt")) {

            int data;

            while ((data = input.read()) != -1) {  // read() reads a char by char
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}