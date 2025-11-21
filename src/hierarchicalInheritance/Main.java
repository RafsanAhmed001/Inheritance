package hierarchicalInheritance;

public class Main {
    public static void main(String[] args) {

        Dog_C1 dog = new Dog_C1();
        dog.eat();   // inherited from Animal
        dog.bark();  // Dog-specific

        Cat_C2 cat = new Cat_C2();
        cat.eat();   // inherited from Animal
        cat.meow();  // Cat-specific
    }
}
