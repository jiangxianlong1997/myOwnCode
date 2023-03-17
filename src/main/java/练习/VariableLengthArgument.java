package 练习;

  /**
   * 微信搜 JavaGuide 回复"面试突击"即可免费领取个人原创的 Java 面试手册
   *
   * @author Guide哥
   * @date 2021/12/13 16:52
   **/
  public class VariableLengthArgument {

    public static void printVariable(String... args) {
      for (String s : args) {
        System.out.println(s);
      }
    }

    public static void printVariable(String arg1, String arg2) {
      System.out.println(arg1 + arg2);
    }

    public static void main(String[] args) {
      printVariable("a", "b");
      printVariable("a", "b", "c", "d");
    }
  }

