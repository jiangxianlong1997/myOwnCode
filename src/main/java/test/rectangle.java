package test;

public class rectangle {

  private final int length;
  private final int width;

  public rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public int getArceage() {
    return length * width;
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }
}
