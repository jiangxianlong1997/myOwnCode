package 培训;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise1 {


  public static void main(String[] args) {
    System.out.print("请输入会员积分: ");
    Scanner scanner = new Scanner(System.in);
    try {
      int input = scanner.nextInt();
//      String output = "该会员享受的折扣是： ";
      int result = 0;
      if (input < 2000) {
        result = (int) (input * 0.9);
      } else if (input < 4000) {
        result = (int) (input * 0.8);
      } else if (input < 8000) {
        result = (int) (input * 0.7);
      } else {
        result = (int) (input * 0.6);
      }
      System.out.println("该会员享受的折扣是： " + result);
    } catch (InputMismatchException e) {
      System.out.println("wrong input");
    }

  }

}
