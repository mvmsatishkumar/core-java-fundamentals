package references;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class EqualityAndHashCode {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1));
        students.add(new Student(1));

        System.out.println(students.size());
    }
}
// Interview rule: if equals() says two objects are equal, their hashCode() values must also be equal.
