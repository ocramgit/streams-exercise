import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee("Alice Johnson", 3, 55000, "HR", 19));
        employeeList.add(new Employee("Bob Smith", 7, 75000, "IT", 25));
        employeeList.add(new Employee("Charlie Davis", 10, 90000, "Finance", 35));
        employeeList.add(new Employee("David Miller", 2, 50000, "Marketing", 40));
        employeeList.add(new Employee("Eva Wilson", 5, 60000, "Operations", 50));
        employeeList.add(new Employee("Frank Moore", 8, 80000, "HR", 22));
        employeeList.add(new Employee("Grace Taylor", 4, 60000, "IT", 60));
        employeeList.add(new Employee("Harry Brown", 6, 70000, "Finance", 70));
        employeeList.add(new Employee("Ivy Jones", 9, 85000, "Marketing", 90));
        employeeList.add(new Employee("Jack Williams", 1, 45000, "Operations", 85));
        employeeList.add(new Employee("Karen Davis", 5, 62000, "HR", 76));
        employeeList.add(new Employee("Leo Miller", 3, 51000, "IT", 54));
        employeeList.add(new Employee("Mia Wilson", 7, 72000, "Finance", 34));
        employeeList.add(new Employee("Tina", 4, 61000, "Marketing", 31));
        employeeList.add(new Employee("Marcovski", 2, 48000, "Operations", 31));
        employeeList.add(new Employee("Paul Moore", 6, 69000, "HR", 37));
        employeeList.add(new Employee("Quinn Smith", 8, 83000, "IT", 47));
        employeeList.add(new Employee("Rachel Jones", 1, 43000, "Finance", 40));
        employeeList.add(new Employee("Samuel Williams", 9, 88000, "Marketing", 25));
        employeeList.add(new Employee("Tin", 10, 92000, "Operations", 19));

        EmployeeRepository employeeRepository = new EmployeeRepository();

        System.out.println(employeeRepository.count(employeeList, "Marketing", 5));
        System.out.println(employeeRepository.average(employeeList, "Marketing").toString());
        System.out.println(employeeRepository.findOldest(employeeList, 3).toString());
        System.out.println(employeeRepository.findOlderThan(employeeList, 20).toString());
        System.out.println(employeeRepository.findTheSalaryOver(employeeList, 5000).toString());
        System.out.println(employeeRepository.findFirstNameInCommom(employeeList, "Marketing", "Operations").toString());

    }
}