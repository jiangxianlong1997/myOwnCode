package 培训;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework3<T> {

  public static void ex_1() {
    int[] array = {8, 4, 2, 1, 23, 344, 12};
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i : array
    ) {
      System.out.print(i + " ");
    }
    for (int i : array
    ) {
      sum += i;
    }
    System.out.println(sum);
    for (int j : array) {
      if (j > max) {
        max = j;
      }
      if (j < min) {
        min = j;
      }
    }
    System.out.println("max:" + max);
    System.out.println("min:" + min);
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    for (int i : array
    ) {
      if (input == i) {
        System.out.println("yes");
        return;
      }
    }
    System.out.println("no");
  }

  public static void ex_2() {
    String[] item = {"a", "b", "c", "d", "e"};
    System.out.println("item");
    for (String s : item
    ) {
      System.out.println(s);
    }
  }

  public static int[] Q6_int(int[] input) {
    for (int i = 0; i < input.length / 2; i++) {
      int temp;
      temp = input[i];
      input[i] = input[input.length - i - 1];
      input[input.length - i - 1] = temp;
    }
    return input;
  }

  public static void ex_8() {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    char[] c_arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      c_arr[i] = s.charAt(i);
    }
    Arrays.sort(c_arr);
    System.out.print("Increase order: ");
    for (char c : c_arr
    ) {
      if (c != ' ') {
        System.out.print(c + " ");
      }
    }
    System.out.println();
    System.out.print("Decrease order: ");
    for (int i = 0; i < c_arr.length / 2; i++) {
      char temp;
      temp = c_arr[i];
      c_arr[i] = c_arr[c_arr.length - i - 1];
      c_arr[c_arr.length - i - 1] = temp;
    }
    for (char c : c_arr
    ) {
      System.out.print(c + " ");
    }
  }

  public T[] Q6(T[] input) {
    for (int i = 0; i < input.length / 2; i++) {
      T temp;
      temp = input[i];
      input[i] = input[input.length - i - 1];
      input[input.length - i - 1] = temp;
    }
    return input;
  }

  public static int sum (int i) {
    if (i == 0) return 0;
    return sum(i- 1) + i;
  }

  public static int sum_loop (int i) {
    int sum = 0;
    for (int j = 1; j <= i; j++) {
      sum += j;
    }
    return sum;
  }

  public static int maxNum (int... input) {
    int max = Integer.MIN_VALUE;
    for (int i : input
    ) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  public static ArrayList<Integer> maxList(int[] array, int min, int max) {
    int temp;
    if (max < min) {
      temp = min;
      min = max;
      max = temp;
    }
    Arrays.sort(array);
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int value:array
    ) {
      if (value >= min && value <= max) {
        arrayList.add(value);
      }
    }
   return arrayList;
  }

  public static int[] maxArray(int[] array, int min, int max) {
    int temp;
    if (max < min) {
      temp = min;
      min = max;
      max = temp;
    }
    Arrays.sort(array);
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int value:array
    ) {
      if (value >= min && value <= max) {
        arrayList.add(value);
      }
    }
    int[] arrayInt = new int[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      arrayInt[i] = arrayList.get(i);
    }
    return arrayInt;
  }

  public static int maxInArray(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int value:array
    ) {
      if (max < value) {
        max = value;
      }
    }
    return max;
  }


  //实现35选7，返回一个数组，数组中的元素是7个不重复的随机数
  public static int[] randomArray() {
    int[] result = new int[7];
    for (int i = 0; i < 7; i++) {
      result[i] = (int) (Math.random() * 35 + 1);
     for (int j = 0; j < i; j++) {
       if (result[i] == result[j]) {
         i--;
         break;
       }
     }
    }
    return result;
  }

  public static int factorial(int input) {
    if (input == 0) {
      System.out.println("invalid input");
      return 0;
    }
    if (input == 1) {
      return 1;
    }
    return factorial(input - 1) * input;
  }

  public static int fibonacci(int input) {
    if (input == 0) {
      return 0;
    }
    if (input == 1) {
      return 1;
    }
    return fibonacci(input - 1) + fibonacci(input - 2);
  }

  public static int testEllipsis(int divided_value, int ... input) {
    int sum = 0;
    for (int i: input
    ) {
      sum += i;
    }
    return sum/divided_value;
  }

  public static boolean testPrime(int input) {
    boolean result = true;
    if (input == 1) {
      return true;
    }
    if (input == 2) {
      return true;
    }
    for (int i = 2; i < input; i++) {
      if (input % i == 0) {
        result = false;
        break;
      }
    }
    return result;
  }






  public static void main(String[] args) {
//    ex_1();
//    ex_2();
//    int[] testInt = {2,435,2, 5, 21};
//    Integer[] testInteger = {2,435,2, 5, 21};
//    Homework3<Integer> homework3 = new Homework3<>();
//    homework3.Q6(testInteger);
//    /*转换为Integer[]*/
//    for (int value: homework3.Q6(Arrays.stream(testInt).boxed().toArray(Integer[]::new))
//    ) {
//      System.out.println(value);
//    }
//    ex_8();
//    System.out.println(sum(10));
//    System.out.println(sum_loop(10));System.out.println(maxNum(1, 44, 4, -1 ,2 -88));
//    System.out.println( maxList(new int[]{1, 2, 4, -2, 5, 2, 8}, 1 ,3));
//    for (int value:maxArray(new int[]{1, 2, 4, -2, 5, 2, 8}, 1 ,3)
//    ) {
//      System.out.println(value);
//    }
//    System.out.println(maxInArray(new int[]{1, 2, 4, -2, 5, 2, 8}));
//    System.out.println(Arrays.toString(randomArray()));
//    System.out.println(factorial(4));
//    System.out.println(fibonacci(4));
//    System.out.println(testEllipsis(5,2,3,4,5,6,1));
    System.out.println(testPrime(17));


  }




}

