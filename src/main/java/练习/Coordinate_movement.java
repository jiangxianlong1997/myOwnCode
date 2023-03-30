package 练习;

import java.util.Scanner;

public class Coordinate_movement {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    while (in.hasNextInt()) { // 注意 while 处理多个 case
      int a = in.nextInt();
      int b = in.nextInt();
      System.out.println(a + b);
    }
  }

  private static String OutputString(String str) {
    int x = 0, y = 0;
    String[] strs = str.split(";");
    for (String s : strs) {
      if (s == null || s.trim().length() != 3) {
        continue;
      }

    }
    return null;
  }

}
