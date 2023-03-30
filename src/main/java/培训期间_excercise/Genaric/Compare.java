package 培训期间_excercise.Genaric;

public class Compare {

  public static <T extends Comparable<T>> T arrayMax(T[] array) {
    T max = array[0];
    for (T result : array
    ) {
      if (result.compareTo(max) > 0) {
        max = result;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Integer[] array = {1, 3, 421, -2, 1};
    System.out.println(arrayMax(array));
  }

}
