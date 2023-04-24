package 培训.Object.homework.ParkingArea;

import java.math.BigDecimal;

public class Car extends Vehicle {
  private static final int cost = 5;
  BigDecimal a = BigDecimal.valueOf(1);
  private String brand;

  public Car(String brand) {
    this.brand = brand;
  }

  @Override
  public int cost() {
    System.out.println(a);
    return cost;
  }

}
