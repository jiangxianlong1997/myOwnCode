package sort;

public class selectionsort {

  public static int[] select(int[] array) {
    if (array.length == 0) {
      return array;
    }
    for (int i = 0; i < array.length; i++) {
      int minindex = i;
      for (int j = i; j < array.length; j++) {
        if (array[minindex] > array[j]) {
          minindex = j;
        }
      }
      int temp = array[minindex];
      array[minindex] = array[i];
      array[i] = temp;
    }
    return array;
  }

  public static void main(String args[]) {
    int a[] = {1, 3, 6, 0, 2};
    select(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
