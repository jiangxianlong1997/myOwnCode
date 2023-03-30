package 培训.Object;

public class Rectangle {
  private int width;
  private int length;

  public Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  public int getArea() {
    return width * length;
  }

  public int getPre() {
    return 2 * (width + length);
  }

  public void showAll() {
    System.out.println("length: " + this.length + " width: " + this.width + " Area: " + this.getArea() + " Pre: " + this.getPre());
  }
}
