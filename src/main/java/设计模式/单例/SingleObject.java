package 设计模式.单例;

public class SingleObject {

  //恶汉式
  private static final SingleObject instance = new SingleObject();

  private SingleObject() {
  }

  public static SingleObject getInstance() {
    return instance;
  }

  public void showMessage() {
    System.out.println("hi");
  }
}
