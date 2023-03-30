package 培训期间excercise.Genaric;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try {
      int i = scan.nextInt();
      if (i == 0) {
        System.out.println("hey, here it is");
      } else {
        System.out.println("not zero");
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid input");
    }

  }

}
