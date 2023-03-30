package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class overridesortofArrayList {

  public static void ListStringSort(ArrayList<String> list) {
    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int num1 = Integer.parseInt(o1);
        int num2 = Integer.parseInt(o2);
        if (num1 > num2) {
          return 1;
        }
        if (num1 < num2) {
          return -1;
        }
        return 0;
      }
    });
  }

  public static void decendingListSort(ArrayList<String> list) {
    Collections.sort(list, new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
            int num1 = Integer.parseInt(o1);
            int num2 = Integer.parseInt(o2);
            if (num1 > num2) {
              return -1;
            }
            if (num1 < num2) {
              return 1;
            } else {
              return 0;
            }
          }
        }
    );
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("15");
    list.add("34");
    list.add("1");
    list.add("4");
    list.add("334");
    list.add("222");
    //ListStringSort(list);
    ArrayList<Integer> newarr = new ArrayList<>();
    newarr.add(1);
    newarr.add(4);
    newarr.add(213434);
    newarr.add(35);
    newarr.add(-10);
    Collections.sort(newarr);
    for (Integer i : newarr) {
      System.out.println(i);
    }
    decendingListSort(list);
    for (String s : list) {
      System.out.println(s);
    }
  }
}
