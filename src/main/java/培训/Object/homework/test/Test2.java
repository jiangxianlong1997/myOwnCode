package 培训.Object.homework.test;

public class Test2 {

  public static void main(String[] args) {
    Person person = new Person();
    if (person instanceof Student) {
      person = new Student();
    }
    System.out.println(person.getName());

  }



}
