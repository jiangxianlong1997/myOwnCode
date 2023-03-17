package 设计模式.单例;

public class Singleton2 {

  private Singleton2() {
  }

  public static final Singleton2 getInstance() {
    return singletonholder.instance;
  }

  //登记式单例
  //好
  private static class singletonholder {

    private static final Singleton2 instance = new Singleton2();
  }
}
