package 培训.Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2 {

  public static void do_menu() {
    String output = " ";
    Scanner scanner = new Scanner(System.in);

    try {
      int in = scanner.nextInt();
      while (in < 1 || in > 4) {
        System.out.print("wrong ,please input again: ");
        in = scanner.nextInt();
      }
      switch (in) {
        case 1:
          output = "a";
          break;
        case 2:
          output = "b";
          break;
        case 3:
          output = "c";
          break;
        case 4:
          output = "d";
          break;
      }
      System.out.println("end " + output);

    } catch (InputMismatchException e) {
      System.out.print("wrong type please input again: ");
      do_menu();
    }

  }



  public static void menu() {

    System.out.println("welcome");
    System.out.println();
    System.out.println("*********************");
    System.out.println("     " + "1. a");
    System.out.println("     " + "2. b");
    System.out.println("     " + "3. c");
    System.out.println("     " + "4. d");
    System.out.println("*********************");
    System.out.println();
    System.out.print("please choose: ");
  }

  public static void log_in() {
    String username = "a";
    String password = "1";
    int counter = 3;
    while (counter > 0) {
      System.out.print("please input username: ");
      Scanner name_scanner = new Scanner(System.in);
      String input_name = name_scanner.next();
      System.out.print("please input password: ");
      Scanner pas_scanner = new Scanner(System.in);
      String input_pass = pas_scanner.next();
      if (!input_name.equals(username) || !input_pass.equals(password)) {
        System.out.println("Wrong Input, " + --counter + " chance remain.");
        System.out.println();
      } else {
        System.out.println("welcome");
        return;
      }
    }
    System.out.println("sorry 3 times error");

  }

  public static void exc() {
    int index = 1;
    while (index <= 10) {
      System.out.println(index + " * " + 10 + " = " + 10 * index);
      index++;
    }

  }

  public static void temperature() {
    double c_degree = 0;
    double f_degree = 0;
    int i = 0;

    while (i < 10) {
      f_degree = c_degree * 9 / 5 + 32;
      i++;
      System.out.println(
          i + ": " + "C = " + String.format("%.0f", c_degree) + ", F = " + String.format("%.2f",
              f_degree));
      c_degree += 20;
    }

  }

  public static int Q4(int i) {
    if (i == 10) {
      return 1;
    }
    return 2 * (Q4(i + 1) + 1);
  }

  public static void Q4_loop() {
    int numOfPeach = 1;
    for (int i = 10; i > 1; i--) {
      numOfPeach = (numOfPeach + 1) * 2;
    }
    System.out.println("第一天共摘了 " + numOfPeach + " 个桃子。");
  }

  public static void ex_2() {
    int random_num = (int) (Math.random() * 10 + 1);
    System.out.print("Input :");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    while (input < random_num) {
      System.out.println("small");
      input = scanner.nextInt();
    }
    while (input > random_num) {
      System.out.println("big");
      input = scanner.nextInt();
    }
    System.out.println("correct number is: " + input);
  }

  public static void ex_3() {
    int counter = 1;
    int result = 0;
    System.out.print("class: ");
    Scanner class_scanner = new Scanner(System.in);
    class_scanner.next();
    System.out.print("total num: ");
    Scanner num_scanner = new Scanner(System.in);
    int num = num_scanner.nextInt();
    while (counter <= num) {
      System.out.print("please input number" + counter + "'s grade: ");
      num_scanner.nextInt();
      result += num;
      counter++;
    }
    System.out.println("average score is: " + result / num);

  }

  public static void for_exc() {
    System.out.print("input: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    System.out.println("out put table: ");
    for (int i = 0; i < input; i++) {
      System.out.println(i + " + " + (input - i) + " = " + input);
    }
  }

  public static void continue_exc() {
    int counter = 1;
    int over80_c = 0;
    System.out.print("class: ");
    Scanner class_scanner = new Scanner(System.in);
    class_scanner.next();
    System.out.print("total num: ");
    Scanner num_scanner = new Scanner(System.in);
    int num = num_scanner.nextInt();
//    while (counter <= num) {
//      System.out.print("please input number" + counter + "'s grade: ");
//      int score = num_scanner.nextInt();
//      if (score > 80) {
//        over80_c++;
//      }
//      counter++;
//    }
    for (int i = 0; i < num; i++) {
      System.out.print("please input number" + counter + "'s grade: ");
      counter++;
      int score = num_scanner.nextInt();
      if (score > 80) {
        continue;
      }
      over80_c++;
    }
    System.out.println("number over 80: " + over80_c);
    System.out.println("percentage over 80 is : " + (double) over80_c / (double) num);
  }

  public static void print_diamond(int input) {
    if (input == 1) {
      System.out.println("*");
      return;
    }
    if ((input & 1) == 0) {
      System.out.println("invalid input");
      //return;
    }
    for (int i = 0; i < input / 2; i++) {
      for (int j = 0; j < input / 2 - i; j++) {
        System.out.print(' ');
      }

      System.out.print('*');
      for (int j = 0; j <= 2 * i - 1; j++) {
        System.out.print(' ');
      }
      System.out.print("*");
      System.out.println();
    }
    for (int i = input / 2 + 1; i <= input; i++) {

      for (int j = input; j < input / 2 + i; j++) {
        System.out.print(' ');
      }

      System.out.print('*');
      for (int j = input; j > i; j--) {
        System.out.print(' ');
        System.out.print(' ');
      }
      System.out.print("*");
      System.out.println();
    }

  }

  //先找规律成非空心，再if判断测试空心部分
  public static void print_diamond_t(int input) {

  }

  public static void main(String[] args) {
//    Q4_loop();
//    System.out.println(Q4(1));
//    temperature();
//    exc();
//    menu();
//    do_menu();
//    log_in();
//    ex_3();
//    continue_exc();
    print_diamond(11);
  }
}
