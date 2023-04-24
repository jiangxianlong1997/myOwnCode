package 培训.Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework {

  public static String evenOrOdd(int num) {
    if (num % 2 == 0) {
      return "even";
    } else {
      return "odd";
    }
  }

  public static void Q6(int i) {
    if (i == 1) {
      System.out.println(5);
    } else if (i == 5) {
      System.out.println(5);
    } else {
      System.out.println("None");
    }
  }

  public static void testModBy5or6(int input) {
    if (input % 5 == 0 && input % 6 == 0) {
      System.out.println("could be mod by 5 and 6");
    } else if (input % 5 == 0) {
      System.out.println("could be mod by 5");
    } else if (input % 6 == 0) {
      System.out.println("could be mod by 6");
    } else {
      System.out.println("could not be mode by 5 or 6");
    }
  }

  public static boolean testLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

  public static void Q9() {
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
      System.out.println("invalid" + " input");
    }
  }

  public static void simpleSort(int a, int b, int c) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(a);
    arrayList.add(b);
    arrayList.add(c);
    Collections.sort(arrayList);
    for (int i : arrayList) {
      System.out.print(i + " ");
    }

  }

  public static void writeSort(int a, int b, int c) {
    int[] array = {a, b, c};
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }

    System.out.println(array[0] + array[1] + array[2]);
  }

  public static int Q13_ForLoop() {
    int num = 0;
    for (int i = 0; i < 100; i++) {
      if (i % 3 == 0) {
        num += i;
      }
    }
    return num;
  }

  public static int Q13_WhileLoop() {
    int num = 0;
    int i = 0;
    while (i < 100) {
      i++;
      if (i % 3 == 0) {
        num += i;
      }
    }
    return num;
  }

  public static int Q13_DoWhileLoop() {
    int num = 0;
    int i = 0;
    do {
      i++;
      if (i % 3 == 0) {
        num += i;
      }
    } while (i < 100);

    return num;
  }

  public static int Q15(int input) {
    int result = 1;
    for (int i = 1; i < input + 1; i++) {
      result = result * i;
    }
    return result;
  }

  public static ArrayList<Integer> Q16_all() {
    Boolean[] indexArray = new Boolean[300];
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < 300; i++) {
      indexArray[i] = true;
    }
    indexArray[0] = false;
    indexArray[1] = false;
    for (int i = 2; i < 300; i++) {
      for (int j = i * 2; j < 300; j += i) {
        indexArray[j] = false;
      }
    }
    for (int i = 0; i < 300; i++) {
      if (indexArray[i]) {
        arrayList.add(i);
      }
    }
    return arrayList;
  }

  public static int Q16(int input) {
    while (true) {
      int i = 2;
      for (; i < input; i++) {
        if (input % i == 0) {
          break;
        }
      }
      if (i == input) {
        return input;
      }
      input++;

    }
  }

  public static int Q17(int input) {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(input);
    stringBuffer.reverse();
    int result;
    if (stringBuffer.substring(stringBuffer.length() - 1).equals("-")) {
      result = -Integer.parseInt(stringBuffer.substring(0, stringBuffer.length() - 1));
      return result;
    }
    result = Integer.parseInt(stringBuffer.toString());
    return result;


  }

  public static int Q17Loop(int input) {
    int sum = 0;
    int length = String.valueOf(input).length();
    for (int i = length - 1; i >= 0; i--) {
      sum += (input % 10) * Math.pow(10, i);
      input /= 10;
    }
    return sum;
  }

  public static int ex1(int val) {
    int start = 80000;
    int index = 2006;
    while (start <= val) {
      start *= 1.25;
      index++;
    }
    return index;
  }

  public static void calculate_sum_of_int() {
    Scanner scanner = new Scanner(System.in);
    try {
      int input = scanner.nextInt();
      int sum = 0;
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append(input);
      if (stringBuffer.substring(0, 1).equals("-")) {
        for (int i = 0; i < stringBuffer.length() - 1; i++) {
          sum += Integer.parseInt(stringBuffer.substring(i + 1, i + 2));
        }
        System.out.println(sum);
        return;
      }
      for (int i = 0; i < stringBuffer.length(); i++) {
        sum += Integer.parseInt(stringBuffer.substring(i, i + 1));
      }
      System.out.println(sum);
    } catch (InputMismatchException e) {
      System.out.println("wrong input");
    }
  }

  public static void c_dig_int() {
    Scanner scanner = new Scanner(System.in);
    try {
      int input = scanner.nextInt();
      int sum = 0;
      while (input != 0) {
        sum += input % 10;
        input /= 10;
      }
      System.out.println(sum > 0 ? sum : -sum);
    } catch (InputMismatchException e) {
      System.out.println("wrong input");
    }
  }

  public static void Q14() {
    for (int i = 0; i < 10; i++) {
      if (i != 5) {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
//    System.out.println(evenOrOdd(4));
//    Q6(3);
//    testModBy5or6(31);
//    testModBy5or6(30);
//    System.out.println(testLeapYear(200));
//    Q9();
//    simpleSort(1, 5, -2);
//    writeSort(-2,9,0);
//    System.out.println(Q13_DoWhileLoop());
//    System.out.println(Q13_WhileLoop());
//    System.out.println(Q13_ForLoop());
//    System.out.println(Q15(5));
    System.out.println(Q16_all());
    System.out.println(Q16(204));
//    System.out.println(Q17(-4344));
//    System.out.println(ex1(200000));
//    calculate_sum_of_int();
//    c_dig_int();
//    System.out.println(Q17Loop(4321));

  }

}
