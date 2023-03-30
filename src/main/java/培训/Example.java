package 培训;

import java.util.ArrayList;

public class Example {
  public static void main(String[] args) {
    System.out.println("\"\\Hello World\\\"");
    System.out.println("Hello" + "\" " + "/World\"");
    ArrayList arr = new ArrayList();
    arr.add("A");
    arr.add(1);
    arr.add(3);
    arr.add(2, "C");
    arr.set(1,2);
    arr.remove(2);
    System.out.println(arr);
    // 定义两个字符串变量
    String str1 = "Hello";
    String str2 = "World";

    // 打印交换前的值
    System.out.println("Before:");
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);

    // 调用 swapStrings() 方法交换两个字符串变量的值
    String[] result = swapStrings(str1, str2);
    str1 = result[0];
    str2 = result[1];

    // 打印交换后的值
    System.out.println("After:");
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);
  }

  // 定义一个 swapStrings() 方法通过返回数组来交换两个字符串变量的值
  public static String[] swapStrings(String a, String b) {
    String temp = a;
    a = b;
    b = temp;
    return new String[] {a, b};
  }

}