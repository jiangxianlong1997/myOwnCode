package 培训.javaCollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise {
  public static boolean testAt(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '@') {
        return true;
      }
    }
    return false;
  }

  public static boolean testNum(String s, char c) {
    int counter = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        counter++;
      }
    }
    return counter == 1;
  }

  public static void testEmail(String input) {
    if (! (input.contains(".")) || !(input.contains("@")) ) {
      System.out.println("illegal it do not contains . or @ ");
      return;
    } else if (input.indexOf('.') != input.lastIndexOf('.') || input.indexOf('@') != input.lastIndexOf('@')) {
      System.out.println("illegal it contains more than one . or @ ");
      return;
    } else if (input.indexOf('.') < input.indexOf('@')) {
      System.out.println("illegal . before @ ");
      return;
    }
//    String replace = input.replace('@', '1').replace('.', '2');
    for (int i = 0; i < input.split("@")[0].length(); i++) {
      if (!((input.split("@")[0].charAt(i) >= '0' && input.split("@")[0].charAt(i) <= '9')
              || (input.split("@")[0].charAt(i) >= 'a' && input.split("@")[0].charAt(i) <= 'z')
              || (input.split("@")[0].charAt(i) >= 'A' && input.split("@")[0].charAt(i) <= 'Z' ))) {
        System.out.println("illegal with other characters");
        return;
      }
    }
    System.out.println("legal");
  }

  public static int Q2() {
    int counter = 0;
    System.out.print("input: ");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'e') {
        counter++;
      }
    }
    return counter;
  }
  //2,6,7,8

  public static int Q6() {
    int counter = 0;
    Scanner scanner = new Scanner(System.in);
    String string = scanner.next();
    Scanner subscanner = new Scanner(System.in);
    String subString = subscanner.next();
    if ( ! string.contains(subString)) {
      System.out.println("Do not have the subString");
      return 0;
    }
    for (int i = 0; i <= string.length() - subString.length(); i++) {
        if (subString.equals(string.substring(i, i + subString.length()))) {
          counter++;
        }
    }
    return counter;
  }

  public static void Q7(String s) {
    int chineseCounter = 0;
    int numCounter = 0;
    int letterCounter = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i)>= '0' && s.charAt(i) <= '9') {
        numCounter++;
      }
      if ((s.charAt(i)>= 'a' && s.charAt(i) <= 'z') || (s.charAt(i)>= 'A' && s.charAt(i) <= 'Z')){
        letterCounter++;
      }
      if (s.charAt(i)>= 128) {
        chineseCounter++;
      }
    }
    System.out.println("chinese： " + chineseCounter);
    System.out.println("number: " + numCounter);
    System.out.println("letter: " + letterCounter);
  }

  public static void Q8() {
    System.out.print("input: ");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(s);
    if (stringBuilder.reverse().toString().equals(s)) {
      System.out.println(stringBuilder);
      System.out.println("true");
      return;
    }
    System.out.println("false");
  }

  public static void Q8_String() {
    System.out.print("input: ");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    for (int i = 0; i < s.length()/2; i++) {
      if (!(s.charAt(i) == s.charAt(s.length() - i - 1))) {
        System.out.println("false");
        return;
      }
    }
    System.out.println("true");
  }

  //4,9,10,11
  public static void testSimpleDateFormat() throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Date date = simpleDateFormat.parse("2023-04-01 06:10:20");
    System.out.println(date);
    System.out.println(date.toString());
  }

  public static void Q4Bad(Date date) {
    Calendar parisCalendar = Calendar.getInstance();
    parisCalendar.add(date.getHours(),7 * 60);
    Date parisDate = parisCalendar.getTime();
    System.out.println("Paris time: " + parisDate);
    Calendar USACalendar = Calendar.getInstance();
    USACalendar.add(date.getHours(), 12 * 60);
    Date USADate = USACalendar.getTime();
    System.out.println("USA time: " + USADate);
  }

  /**
   * 输入一行字符，将其中的字母变成其后续的第3个字母，输出。例：a→d，x　→　a；y　→　b；编程实现。
   */
  public static void Q12() {
    System.out.print("input: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    for (int i = 0; i < input.length(); i++) {
      System.out.print((char) (input.charAt(i) + 3));
    }
  }

  /**
   * 编写一个方法验证用户输入的日期格式是否正确，要求格式为：2006/12/12。
   * 方法的参数是要验证的日期字符串，如果格式正确返回true，否则返回false。
   */

  public static boolean Q10() {
    System.out.print("input : ");
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    try {
      simpleDateFormat.parse(input);
      return true;
    } catch (ParseException e) {
      return false;
    }
  }
  /**
   * 请编程实现：由键盘输入的任意一组字符，统计其中大写字母的个数m和小写字母的个数n，并输出m、n中的较大者。
   */
  public static int Q11() {
    int m = 0;
    int n = 0;
    System.out.print("input: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
        n++;
      }
      if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
        m++;
      }
    }
    return Math.max(m, n);
  }

  /**
   * 编写一个方法为物品生成一个指定长度的编号，要求编号的每一位或者为0到9的数字，或者为A到Z的大写字母，每次产生的编号是随机的
   * @param length length of input
   * @return random String
   */
  public static String Q9(int length) {
    char[] arr = new char[36];
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < length; i++) {
      arr[i] =  (char) ('0' + i);
    }
    for (int i = 0; i < 26; i++) {
      arr[10 + i] = (char) ('a' + i);
    }
    for (int j = 0; j < length; j++) {
      stringBuilder.append(arr[ (int)(Math.random() * arr.length)]);
//        System.out.println(stringBuilder.charAt(j));
    }
    return stringBuilder.toString();
  }






  public static void main(String[] args) throws ParseException {
//    String s = "sad@wew.com";
//    System.out.println(testAt(s));
//    System.out.println(s.contains("@"));
//    System.out.println(testNum(s,'.'));
//    String replace = s.replace('e', 'a');
//    System.out.println(replace);
//    String s1 = "abcd";
//    String s2 = "bbc";
//    System.out.println(s1.compareTo(s2));
//    testEmail("asd@1.com");
//    System.out.println(Q2());
//    System.out.println(Q6());
//    Q7("dsad321发挥地方");
//    Q8_String();
//    testSimpleDateFormat();
//    Q4Bad(new Date());
//    Q12();
//    System.out.println(Q10());
    System.out.println(Q9(20));
  }

}
