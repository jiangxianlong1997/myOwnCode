package test;

import java.util.Scanner;

public class testDongruan {
  public static int changeToBinary(int i) {

    int digit = 0;
    int result = 0;
    int left = 0;
    while(i!=0) {
      left = i%2;
      i = i/2;
      result += left*Math.pow(10,digit);
      digit++;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(changeToBinary(33));
    Scanner scanner = new Scanner(System.in);
    String a = scanner.next();
    String b = scanner.next();
    String c = scanner.next();
    System.out.println(a + " " + b + " " +c);
    System.out.println((Integer.parseInt(a)+Integer.parseInt(b) + Integer.parseInt(c))/3);
  }
}
