package 培训.Object.School.homework;

/**
 * 定义一个Vehicle类的子类轿车类Car，要求如下： （a）轿车有自己的属性载人数loader（int 类型）。 （b）提供该类初始化属性的构造方法。
 * （c）重新定义run()，用打印语句描述轿车奔跑的功能。 （d）定义测试类Test，在其main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。
 */
public class Vehicle {

  private final String brand;
  private String color;
  private double speed;

  public Vehicle(String brand, String color) {
    this.brand = brand;
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public void run() {
    System.out.println("brand: " + brand + " color: " + color + " speed: " + speed);
  }

}
