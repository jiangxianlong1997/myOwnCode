package 培训;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch_Exercise {

  public static void main(String[] args) {

    char res = ' ';
    System.out.print("请输入成绩: ");
    Scanner scanner = new Scanner(System.in);
    try {
      int score = scanner.nextInt();
      if (score > 100 || score < 0) {
        System.out.println("Invalid marks");
        return;
      }
      switch (score / 10) {
        case 10:
          res = 'A';
          break;
        case 9:
          res = 'b';
          break;
        case 8:
          res = 'c';
          break;
        default:
          res = 'd';
      }
      System.out.println("成绩等级为： " + res);
    } catch (InputMismatchException e) {
      System.out.println("wrong input");
    }
  }

}
