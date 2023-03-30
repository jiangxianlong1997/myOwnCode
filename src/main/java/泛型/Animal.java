package 泛型;

public class Animal {

  private final String name;
  private final int leg;

  public Animal(String name, int leg) {
    this.name = name;
    this.leg = leg;
  }


  public String makeNoise() {
    return "noise";
  }

  public int getLeg() {
    return leg;
  }


}
