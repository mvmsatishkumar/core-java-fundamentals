package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Employee(String name, String department) {}

public class GroupingBy {
	
    public static void main(String[] args) {
    	
        List<Employee> employees = Arrays.asList(
                new Employee("A", "IT"),
                new Employee("B", "HR"),
                new Employee("C", "IT")
        );

        Map<String, List<Employee>> grouped =
                employees.stream().collect(Collectors.groupingBy(Employee::department));

        System.out.println(grouped);
    }
}
// Interview pattern: groupingBy creates a Map<K,List<T>> unless a downstream collector changes the value type.
