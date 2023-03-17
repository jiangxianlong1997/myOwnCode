package 泛型;

public class Dog extends Animal{
  public Dog(String name, int leg){
    super(name, leg);
  }

  @Override
  public String makeNoise() {
    return "dog";
  }

  @Override
  public int getLeg() {
    return 2;
  }
}
