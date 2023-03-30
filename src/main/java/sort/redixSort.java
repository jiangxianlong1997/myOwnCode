package sort;

public class redixSort {

  //  public static int[] redixSort(int[] array) {
//    if(array == null || array.length < 2) {
//      return array;
//    }
//    int max = Integer.MIN_VALUE;
//    for(int i = 0; i < array.length; i++) {
//      if(max < array[i]){
//        max = array[i];
//      }
//    }
//    int max_digit = 0;
//    while(max != 0){
//      max/=10;
//      max_digit++;
//    }
//    ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
//    for (int i = 0; i < 10; i++){
//      bucketList.add(new ArrayList<Integer>());
//    }
//    int div = 1;
//    for (int i = 0; i < max_digit; i++, div *= 10) {
//      for (int j = 0; j < array.length; j++) {
//        int num = (array[j] / div) % 10;
//        bucketList.get(num).add(array[j]);
//      }
//
//      int index = 0;
//      for (int j = 0; j < bucketList.size(); j++) {
//        for (int k = 0; k < bucketList.size(); k++){
//           array[index++] = bucketList.get(j).get(k);
//        }
//      }
//    }
//    return array;
//
//  }
  public static void radixSort(int[] num) {
    if (isEmpty(num)) {
      return;
    }
    int tmp = getMax(num);
    // get loop count
    int loop = 0;
    do {
      loop++;
    } while ((tmp = tmp / 10) > 0);
    int count = 1, k, lsd;
    int[][] bubble = new int[10][num.length];
    int[] order = new int[10];
    tmp = 1;
    while (count <= loop) {
      for (int i = 0; i < num.length; i++) {
        lsd = (num[i] / tmp) % 10;
        bubble[lsd][order[lsd]] = num[i];
        order[lsd]++;
      }
      k = 0;
      for (int i = 0; i < 10; i++) {
        if (order[i] != 0) {
          for (int j = 0; j < order[i]; j++) {
            num[k] = bubble[i][j];
            k++;
          }
        }
        order[i] = 0;
      }
      tmp *= 10;
      count++;
    }
  }

  private static int getMax(int[] num) {
    if (isEmpty(num)) {
      throw new IllegalArgumentException();
    }
    int max = num[0];
    for (int i = 1; i < num.length; i++) {
      if (max < num[i]) {
        max = num[i];
      }
    }
    return max;
  }

  private static boolean isEmpty(int[] num) {
    return num == null || num.length == 0;
  }

  public static void main(String[] args) {
    int[] a = {6, 5, 2, 1, 8, 11, 1, 45, 23, 100, 400, 23, 430, 243};
    radixSort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }


}
