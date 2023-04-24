package 培训.Object.homework.Eat;

public class Dog extends Pet implements Eatable,FlyingDiscCatchable{

  public Dog(String name, int health, int love) {
    super(name, health, love);
  }

  @Override
  public void eat() {
    System.out.println("Dog eat");
  }

  @Override
  public void catchingFlyDisc() {
    System.out.println("Dog is playing");
  }

  @Override
  public void print() {
    System.out.println("name: " + getName() + " health: " + getHealth() + " love: " + getLove());
  }
}
