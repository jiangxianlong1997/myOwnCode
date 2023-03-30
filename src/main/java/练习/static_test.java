package 练习;

public class static_test {

  private static final int i = 1;
  private final int j = 2;

  public static int test1() {
    return i + 1;
  }

  public static void main(String[] args) {
    System.out.println(test1());
    static_test staticTest = new static_test();
    System.out.println(staticTest.test());
    System.out.println(staticTest.test2());
  }

  public int test() {
    return i + 1;
  }

  public int test2() {
    return j + 1;
  }

}
