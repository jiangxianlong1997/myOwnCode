package 培训.Object.School;

public class UndergraduateStudent extends Student{
  private String unikey;

  public UndergraduateStudent(String unikey, String name) {
    super(name);
    this.unikey = unikey;
    this.name= name;
  }

  public String getUnikey() {
    return unikey;
  }

  public static void main(String[] args) {
    Student student = new UndergraduateStudent("a","a");
    System.out.println(student.name);
    student.testMethod();
    if (student instanceof UndergraduateStudent) {
      UndergraduateStudent undergraduateStudent = (UndergraduateStudent) student;
    } else {
      System.out.println("not student");
    }

  }
}
