package oop;

class Counter {
    static int count;
    final int id;     // cannot be left uninitialized 
    
//    public Counter() {
//        // id never initialized then invalid and throw error (blank final field id may not have been initialized)
//    }
    
    public Counter() {
    		id = 10;
    		count++;
    }
    Counter(int id) {
        this.id = id;
        count++;
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {
        new Counter(1);
        new Counter(2);
        
        new Counter();
        new Counter();
        System.out.println(Counter.count);
    }
}
// Interview map: static belongs to the class and is shared among all objects.
//final prevents reassignment/overriding/inheritance depending on where it is used.
