package 培训.Object.School;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
 private static ArrayList<String> name_list = new ArrayList<>();
 public static void print() {

  System.out.print("Input name: ");
  Scanner scanner = new Scanner(System.in);
  String name = scanner.next();
  name_list.add(name);
  System.out.print("Continue?(Y/N)");
  Scanner scanner1 = new Scanner(System.in);
  String identify = scanner1.next();
  if (identify.equals("Y") || identify.equals("y")) {
   print();
  } else if (identify.equals("N") || identify.equals("n")) {
   for (String s :name_list
   ) {
    System.out.print(s + " ");
   }
   System.out.println();
   System.out.print("please select the name: ");
   Scanner scanner2 = new Scanner(System.in);
   String input_name = scanner2.next();
   for (String value: name_list
   ) {
    if (value.equals(input_name)) {
     System.out.println("have this name");
     System.exit(0);
    }
   }
   System.out.println("not in the list");
   System.exit(0);
  } else {
   System.out.println("Invalid input, please input again");
   print();
  }

 }

 public static void main(String[] args) {
  print();
 }
}
