package sort;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSort {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(4);
    arrayList.add(4);
    arrayList.add(1);
    arrayList.add(12);
    arrayList.add(3);
    arrayList.sort(Comparator.naturalOrder());
    arrayList.sort(Comparator.reverseOrder());
    arrayList.forEach((i) -> {
      System.out.println(i);
    });
  }

}
