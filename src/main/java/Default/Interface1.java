package Default;

//interface里可以有写好的default方法
public interface Interface1 {

  default void helloWorld() {
    System.out.println("hi i'm Interface1");
  }
}
