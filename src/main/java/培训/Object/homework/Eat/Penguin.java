package 培训.Object.homework.Eat;

public class Penguin extends Pet implements Eatable, Swimmable{

  public Penguin(String name, int health, int love) {
    super(name, health, love);
  }

  @Override
  public void print() {
    System.out.println("name: " + getName() + " health: " + getHealth() + " love: " + getLove());
  }


  @Override
  public void swim() {
    System.out.println("I'm swimming");
  }

  @Override
  public void eat() {
    System.out.println("Penguin eat");
  }
}
