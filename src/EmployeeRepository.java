import java.util.*;

public class EmployeeRepository {

    public long count(LinkedList<Employee> employees, String department, Integer years) {
        return employees.stream()
                .filter(e -> e.getDepartament().equals(department) && e.getYears_working() > years)
                .count();
    }

    public List<String> findTheSalaryOver(LinkedList<Employee> employees, Integer salary) {
        return employees.stream()
                .filter(e -> e.getSalary() > salary)
                .map(Employee::getName)
                .toList();
    }

    public List<Employee> findOldest(LinkedList<Employee> employees, Integer howMuch) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .limit(howMuch)
                .toList();
    }

    public Optional<Employee> findOlderThan(LinkedList<Employee> employees, Integer x) {
        return employees.stream()
                .filter(e -> e.getAge() > x)
                .findFirst();
    }

    public OptionalDouble average(LinkedList<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getDepartament().equals(department))
                .mapToDouble(Employee::getSalary)
                .average();
    }

    public String findFirstNameInCommom(LinkedList<Employee> employees, String department, String departament2) {
        Optional<Employee> emp = employees.stream()
                .filter(e -> e.getDepartament().equals(department))
                .filter(e -> employees.stream()
                        .anyMatch(e2 -> e2.getDepartament().equals(departament2) && e.getName().equals(e2.getName())))
                .findFirst();

        return emp.isPresent() ? emp.get().getName() : "";


    }
}