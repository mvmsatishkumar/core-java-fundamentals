package basics;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline before reading a full line.
            String name = sc.nextLine();

            System.out.println(name + " " + age);
        }
    }
}
// Interview trap: nextInt()/next() do not consume the line separator; nextLine() after them may read an empty line.
