public class Employee {
    private String name;
    private Integer years_working;
    private Integer salary;
    private String departament;
    private Integer age;

    public Employee(String name, Integer years_working, Integer salary, String departament, Integer age) {
        this.name = name;
        this.years_working = years_working;
        this.salary = salary;
        this.departament = departament;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", years_working=" + years_working +
                ", salary=" + salary +
                ", departament='" + departament + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getYears_working() {
        return years_working;
    }

    public String getDepartament() {
        return departament;
    }
}
