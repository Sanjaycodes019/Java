abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    abstract void makeSound(); // Must be implemented by subclasses
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal a = new Dog("Buddy");
        a.eat();
        a.makeSound();

        Animal b = new Cat("Kitty");
        b.makeSound();
    }
}
