package 培训.Object.School;

public class Student {
  static String schoolName = "北京大学";
  String name;
  static {
    System.out.println("static block");
  }
  {
    System.out.println("block");
  }

  public static void main(String[] args) {
//    System.out.println(schoolName);
//    schoolName = "new school";
//    System.out.println(schoolName);
//    Student student = new Student();
//    System.out.println(schoolName);
    Student student = new Student();
    Student student2 = new Student();

  }

}
