package java8;

interface Logger {
	
    default void log() {
        System.out.println("Default log");
    }
}

class App implements Logger { }

public class DefaultMethods {
	
    public static void main(String[] args) {
        new App().log();
    }
}
// Interview question: default methods let interfaces evolve with concrete behavior without forcing every implementation to add the method.
