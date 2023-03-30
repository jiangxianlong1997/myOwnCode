package 培训.Object.School;

public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {
    System.out.println("get a new singleton");
  }

  public static Singleton getInstance() {
    return singleton;
  }


}
