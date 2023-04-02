package 培训.Object.School.homework;

public class Circle extends Shape {

  private double radius;

  public Circle() {
  }

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPer() {
    return Math.PI * (radius * 2);
  }

  @Override
  public void showAll() {
    System.out.println(
        "color: " + getColor() + " radius: " + radius + " Area: " + getArea() + " Per:" + getPer());
  }
}
