package yuanfudao;
import java.util.Scanner;
/*
求a + b 的和
输入描述 ：多组读入每一行有a, b. a>0, b<100000

1 1
 */
public class q1 {

  public class Main {
    public void main(String[] args) {
      Scanner in = new Scanner(System.in);
      while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + b);
      }
    }
  }

}
