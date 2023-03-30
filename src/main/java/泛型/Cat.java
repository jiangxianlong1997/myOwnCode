package 泛型;

public class Cat extends Animal {

  public Cat(String name, int leg) {
    super(name, leg);
  }

  @Override
  public String makeNoise() {
    return "cat";
  }

  @Override
  public int getLeg() {
    return 4;
  }
}
