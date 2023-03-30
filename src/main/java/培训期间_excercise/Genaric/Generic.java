package 培训期间_excercise.Genaric;

public class Generic<T> {

  T obj;

  public Generic(T obj) {
    this.obj = obj;
  }

  public static void main(String[] args) {
    Generic<Integer> generic = new Generic<Integer>(5);
    System.out.println(generic.getObj());

  }

  public T getObj() {
    return obj;
  }

}
