package 培训.Object.School;

public class Dog extends AbstractAnimal{
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
