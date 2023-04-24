package 培训.Object.homework.Eat;

public class Test {

  public static void main(String[] args) {
    Dog dog = new Dog("dog",100,10);
    dog.eat();
    dog.catchingFlyDisc();
    dog.print();

    Penguin penguin = new Penguin("Penguin",100,10);
    penguin.eat();
    penguin.swim();
    penguin.print();

  }


}
