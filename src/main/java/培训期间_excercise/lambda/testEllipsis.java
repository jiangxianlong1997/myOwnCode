package 培训期间_excercise.lambda;

public class testEllipsis {

  public static int add(int... a) {
    int sum = 0;
    for (int i : a
    ) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(add(1, 2, 3, 4));
  }

}
