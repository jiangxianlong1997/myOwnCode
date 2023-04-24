package 培训.javaCollection.FileAndStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
  private Integer id;
  private String name;
  private Integer age;
  private String gender;

  private ArrayList<Student> list;

  public Student(ArrayList<Student> list) {
    this.list = list;
  }

  public Student(Integer id, String name, Integer age, String gender) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", list=" + list +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public ArrayList<Student> getList() {
    return list;
  }

  public void setList(ArrayList<Student> list) {
    this.list = list;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void save() throws IOException {
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream( new File("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/student.txt")));
    objectOutputStream.writeObject(list);
    objectOutputStream.flush();
  }

  public void load() throws IOException, ClassNotFoundException {
    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/student.txt"));
    System.out.println(objectInputStream.readObject());
    objectInputStream.close();
  }

}
