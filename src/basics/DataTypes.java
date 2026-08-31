package basics;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 1.5f;
        double d = 2.5;
        char c = 'A';
        boolean flag = true;

        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d + " " + c + " " + flag);
    }
}
// Interview trap: int is the default integral type; decimal literals are double by default.
