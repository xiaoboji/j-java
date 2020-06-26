package v1ch05.arraylist;

import java.util.ArrayList;
import v1ch05.equals.Employee;

/**
 * @program: practice-demos
 * @description: This program demonstrates the ArrayList Class
 * @author: xiaoboji
 * @create: 2020-06-26 00:16
 */
public class ArrayListTest {
  public static void main(String[] args) {
    // fill the staff array list with three Employee objects
    ArrayList<Employee> staff = new ArrayList<>();

    staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
    staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
    staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

    // raise everyone's salary by 5%
    for (Employee e : staff) {
      e.raiseSalary(5);
    }
    // print out information about all Employee objects
    for (Employee e : staff) {
      System.out.println(
          "name = " + e.getName() + ",salary = " + e.getSalary() + ",hireDay = " + e.getHireDay());
    }
  }
}
