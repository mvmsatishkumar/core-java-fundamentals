package oop;

public class FinalFinallyFinalize {

    final int value = 10;

    public static void main(String[] args) {
        FinalFinallyFinalize demo = new FinalFinallyFinalize();
//        demo.value = 10;   can't do this
        
        try {
            System.out.println(demo.value);
        } finally {
            System.out.println("cleanup block");
        }
    }
}

// final -> prevents reassignment, overriding, or inheritance depending on usage.
// finally -> block used for cleanup that executes after try/catch in normal control flow.
// finalize() -> legacy Object mechanism deprecated for removal; do not use it for resource management.

//Try-with-resources works only with resources that implement AutoCloseable