package 练习;

public class Dog extends Animal{
  public Dog(int i) {
    super(i);
  }

  @Override
  public String call() {
    return "wolf";
  }

  public static void main(String[] args) {
    
    Animal animal = new Animal(10);
    System.out.println(animal.call());
    Dog dog = new Dog(10);
    System.out.println(dog.call());
  }
}
