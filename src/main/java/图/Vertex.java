package 图;

public class Vertex <T>{
  private T label;
  public Vertex(T label) {
    this.label = label;
  }
  public T getLabel() {
    return label;
  }

  @Override
  public String toString() {
    return label.toString();
  }
}
