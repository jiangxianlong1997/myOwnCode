package 设计模式.单例;

//懒汉式(必须加锁，影响效率)
public class Singleton1 {

  private static Singleton1 instance;

  private Singleton1() {
  }

  public static synchronized/*lock*/ Singleton1 getinstance() {
    if (instance == null) {
      return new Singleton1();
    }
    return instance;
  }

}
