package 培训.Object.homework;

public class Vehicle {
  private String brand;
  private String color;
  private double speed;

  public Vehicle(String brand, String color) {
    this.brand = brand;
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public String getBrand() {
    return brand;
  }

  public String getColor() {
    return color;
  }

  public double getSpeed() {
    return speed;
  }

  public void run() {
    System.out.println("brand: " + brand + " color: " + color + " speed: " + speed);
  }

  public static void main(String[] args) {
    Vehicle v = new Vehicle("BMW", "red");
    v.setSpeed(100);
    v.run();
  }
}
