package 培训期间excercise.Genaric;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {

  private final int id;
  private final String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public static void main(String[] args) {
//    Employee[] employees = new Employee[3];
//    employees[0] = new Employee(3, "Alice");
//    employees[1] = new Employee(2, "Bob");
//    employees[2] = new Employee(1, "Charlie");

//    Arrays.sort(employees, Comparator.comparing(Employee::getId));
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee(3, "a"));
    employees.add(new Employee(2, "b"));
    employees.add(new Employee(1, "c"));
    employees.sort(Comparator.comparing(Employee::getId));

    for (Employee emp : employees) {
      System.out.println(emp.getId());
    }
  }

  public int getId() {
    return id;
  }
}
