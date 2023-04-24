package 培训.javaCollection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

  /**
   * 从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来。
   * @return ordered List
   */
  public static ArrayList<String> Q5 () {
    System.out.print("input");
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<>();
    Collections.addAll(arrayList, scanner.nextLine().split(" "));
    arrayList.sort(String.CASE_INSENSITIVE_ORDER);
    return arrayList;
  }

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("apple");
    arrayList.add("grape");
    arrayList.add("banana");
    arrayList.add("pear");
    arrayList.sort(String::compareTo);
    System.out.println(arrayList);
    System.out.println(Q5());
  }

}
