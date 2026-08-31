package designpatterns;

public class Builder {
    private final String name;
    private final int age;

    private Builder(BuilderPattern builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    static class BuilderPattern {
        private String name;
        private int age;

        BuilderPattern name(String name) { this.name = name; return this; }
        BuilderPattern age(int age) { this.age = age; return this; }
        Builder build() { return new Builder(this); }
    }

    public static void main(String[] args) {
        Builder user = new BuilderPattern().name("Satish").age(22).build();
        System.out.println(user.name + " " + user.age);
    }
}
// Interview question: Builder is useful when an object has many optional parameters and construction would otherwise be hard to read.
