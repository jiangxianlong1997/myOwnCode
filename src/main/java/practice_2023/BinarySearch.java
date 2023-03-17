package practice_2023;

public class BinarySearch {

  /*
  Array中查找target，找到return index, else return -1
  */
  public static int binarySearch(int i, int[] array) {
    int min = 0;
    int max = array.length - 1;
    while (max >= min) {
      int middle = (max + min) / 2;
      max++;
      min++;
      if (array[min] == i) {
        return min;
      } else if (array[max] == i) {
        return max;
      }
      min++;
      max--;

    }
    return -1;
  }

  public static void main(String[] args) {
    int[] array = {1, -1, 34, 3, 2};
    System.out.println(binarySearch(34, array));
  }

}
