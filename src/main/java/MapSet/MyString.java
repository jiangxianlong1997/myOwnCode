package MapSet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class MyString {

  public static String toRomanNum() {
    System.out.print("please input: ");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    if (s.length() > 9) {
      System.out.println("invalid input");
      return "";
    }
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) > '9' || s.charAt(i) < '0') {
        System.out.println("invalid input");
        return "";
      }
    }
    StringJoiner sj = new StringJoiner(" ");
    for (int i = 0; i < s.length(); i++) {
      String romNum = switch (s.charAt(i)){
        case '0' -> "";
        case '1' -> "I";
        case '2' -> "II";
        case '3' -> "III";
        case '4' -> "IV";
        case '5' -> "V";
        case '6' -> "VI";
        case '7' -> "VII";
        case '8' -> "VIII";
        case '9' -> "IX";
        default -> throw new IllegalStateException("Unexpected value: " + s.charAt(i));
      };
      sj.add(romNum);
    }
    return sj.toString();
  }

  public static String rotate(String s) {
    char[] arr = s.toCharArray();
    char first = arr[0];
    for (int i = 1; i < s.length(); i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = first;
    return new String(arr);
  }

  public static boolean rotateString(String a, String b) {
    String aft = a;
    for (int i = 0; i < a.length(); i++) {
      aft = rotate(aft);
      if (aft.equals(b)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    StringJoiner stringJoiner = new StringJoiner(",","[","]");
    stringJoiner.add("1").add("2").add("3");
    System.out.println(stringJoiner);
    System.out.println(stringJoiner.length());
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    arrayList1.add(1);
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    arrayList2.add(1);
    System.out.println(arrayList1 == arrayList2);
    System.out.println(arrayList1.equals(arrayList2));
//    System.out.print(toRomanNum());
    System.out.println(rotateString("1234", "3412"));
  }
}
