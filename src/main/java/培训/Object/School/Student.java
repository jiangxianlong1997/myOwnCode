package 培训.Object.School;

public class Student {
  static String schoolName = "北京大学";
  String name;

  public Student(String name) {
    this.name = name;
  }

  static {
    System.out.println("static block");
  }
  {
    System.out.println("block");
  }

  protected void testMethod() {
    System.out.println("test");
  }
  public static void main(String[] args) {
//    System.out.println(schoolName);
//    schoolName = "new school";
//    System.out.println(schoolName);
//    Student student = new Student();
//    System.out.println(schoolName);
    Student student = new Student("a");
    Student student2 = new Student("b");
    student = new Student("b");

  }

}
