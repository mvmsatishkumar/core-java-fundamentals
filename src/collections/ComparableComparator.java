package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}

public class ComparableComparator {
	
    public static void main(String[] args) {
    	
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "B"));
        employees.add(new Employee(1, "A"));

        employees.sort(null); // Uses Employee.compareTo().
        System.out.println(employees);

        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println(employees);
    }
}
// Interview distinction: Comparable defines natural ordering inside the class; Comparator defines external/custom ordering.
