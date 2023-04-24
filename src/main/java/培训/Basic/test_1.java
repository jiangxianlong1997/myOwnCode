package 培训.Basic;

public class test_1 {

  public static void main(String[] args) {
    test_1 test1 = new test_1();
    test1.test();

    int i = 1;
    int j = i++;
    System.out.println(j);
    System.out.println(i);
    System.out.println(++j);
    if ((i > ++j) && (i++ == j)) {
      i += j;
    }
    System.out.println(i);
    System.out.println(4392 / 1000);
    System.out.println((4392 % 1000 - 4392 % 100) / (Math.pow(10, 2)));

  }

  public int test() {
    String a = "1";
    System.out.println(a.equals("0"));
    return 0;
  }

}

