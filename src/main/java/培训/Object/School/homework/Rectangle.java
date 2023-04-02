package 培训.Object.School.homework;

public class Rectangle extends Shape {

  private double width;
  private double height;

  public Rectangle(String color, double width, double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  public Rectangle() {
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPer() {
    return 2 * (width + height);
  }

  @Override
  public void showAll() {
    System.out.println(
        "color: " + getColor() + " height: " + height + " width: " + width + " Area: " + getArea()
            + " Per:" + getPer());
  }

}
