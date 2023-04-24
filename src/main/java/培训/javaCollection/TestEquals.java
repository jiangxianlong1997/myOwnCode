package 培训.javaCollection;

import java.util.Objects;

class Address implements Cloneable {
  private String address;

  public Address(String address) {
    this.address = address;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
class Student implements Cloneable{
  private int id;
  private String name;
  private int age;

  private Address address;

  public Student(int id, String name, int age, Address address) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Address getAddress() {
    return address;
  }

  //  @Override
//  public boolean equals(Object obj) {
//    if (! (obj instanceof Student)) {
//      return false;
//    }
//    Student student = (Student) obj;
////    return student.id == this.id ? true : false;
//    return student.id == this.id;
//  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    // getClass() : 返回当前对象的类对象
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return id == student.id && age == student.age && Objects.equals(name, student.name);
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", address=" + address +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age);
  }

  public Object clone() throws CloneNotSupportedException {
    // 浅拷贝
    Student clone = (Student) super.clone();
    // 深度拷贝
    clone.address = (Address) address.clone();
    return clone;
  }
}

public class TestEquals {

  public static void main(String[] args) throws CloneNotSupportedException {
    Object o1 = new Object();
    Object o2 = new Object();
    System.out.println(o1.equals(o2));
    System.out.printf("%x%n",o1.hashCode());
    System.out.printf("%x%n",o2.hashCode());
    Student student1 = new Student(1,"a",1, new Address("a"));
    Student student2 = new Student(2,"b",1, new Address("a"));

    System.out.println(student2.equals(student1));
    System.out.println(student2.hashCode() == student1.hashCode());
    System.out.println(student2);
    System.out.println(student2.clone());


  }

}
