package loopAndLeetCode;

public class i_sort {

  public static void main(String[] args) {
//    for (int i = 0; i < 10; i++) {
//      if (i > 5) {
//        System.out.println(i);
//      }
//    }
//    int i = 1;
//    int x = 1;
//    x = i++;
//    System.out.println(x);//1
//    System.out.println(i);//2
//    i = 1;
//    x = 1;
//    x = ++i;
//    System.out.println(x);//2
//    System.out.println(i);//2
    for (int j = 0; j < 5; j++) {
      for (int i = 0; i < 5; i++) {
        if (i == 0) {
          System.out.println(i);
          break;//(1)
        }
      }
      System.out.println("跳出1层for循环到这啦");
      if (j == 0) {
        System.out.println("终结者");
        break;//(2)
      }
    }
    double a = 25 / 2;
    System.out.println(a);
    boolean counter = false;
    for (int j = 0; j < 5; j++) {
      if (j == 1) {
        counter = true;
        break;
      }
    }
    System.out.println(counter);
  }

}
