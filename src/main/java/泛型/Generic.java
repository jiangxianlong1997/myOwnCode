package 泛型;

public class Generic<T> {
  private T t;
  public void set(T t) { this.t = t; }
  public T get() { return t; }

  public static void main(String[] args) {
    // do nothing
  }

  /**
   * 不指定类型
   */
  public void noSpecifyType(){
    Generic generic = new Generic();
    generic.set("test");
    // 需要强制类型转换
    String test = (String) generic.get();
    System.out.println(test);
  }

  /**
   * 指定类型
   */
  public void specifyType(){
    Generic<String> generic = new Generic();
    generic.set("test");
    // 不需要强制类型转换
    String test = generic.get();
    System.out.println(test);
  }
}
