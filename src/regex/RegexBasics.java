package regex;

import java.util.regex.Pattern;

public class RegexBasics {
    public static void main(String[] args) {
        String email = "user@example.com";
        boolean valid = Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", email);

        System.out.println(valid);
    }
}
// Interview trap: backslashes in Java regex strings are escaped twice, e.g. "\\s+" represents regex \s+.
