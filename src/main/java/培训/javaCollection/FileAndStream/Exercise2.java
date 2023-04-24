package 培训.javaCollection.FileAndStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exercise2 {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student(1,"a",1,"male"));
    list.add(new Student(2,"b",2,"male"));
    list.add(new Student(3,"c",3,"male"));
    Student student = new Student(list);
    PrintWriter printWriter = new PrintWriter(new FileWriter("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/output.txt"));
    for (Student s:
    student.getList()) {
      printWriter.println("name: " + s.getName() + " id: " + s.getId() + " age: " + s.getAge());
    }
    printWriter.flush();
    BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/output.txt"));
    String s = bufferedReader.readLine();
    while (s != null) {
      System.out.println(s);
      s = bufferedReader.readLine();
    }
    bufferedReader.close();
    student.save();
    student.load();
  }
}
