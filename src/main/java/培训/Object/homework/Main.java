package 培训.Object.homework;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
  //

  public static void sortStudent(Student... students) {
    Arrays.sort(students, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getScore(), o2.getScore());
      }
    });
    for (Student student : students
    ) {
      System.out.println("name = " + student.getName() + " score = " + student.getScore());
    }
  }


  public static void main(String[] args) {
    Student student1 = new Student("a", 1, 99);
    Student student2 = new Student("b", 2, 98);
    Student student3 = new Student("c", 3, 100);
    Student student4 = new Student("d", 4, 80);
    sortStudent(student1, student2, student3, student4);
  }

}
