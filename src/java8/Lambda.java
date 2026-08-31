package java8;

import java.util.function.BinaryOperator;

public class Lambda {
	
    public static void main(String[] args) {
    	
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 3));
    }
}
// Interview question: 
//a lambda provides an implementation of a functional interface; it is not itself a functional interface.
//A lambda is a concise way to represent the implementation of a functional interface.

//Also remember: an abstract class is not a functional interface,
//so you cannot directly assign a lambda to an abstract class.