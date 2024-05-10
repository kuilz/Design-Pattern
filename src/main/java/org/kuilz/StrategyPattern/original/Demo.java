package org.kuilz.StrategyPattern.original;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal("X-animal");
        animal.eat();
        Animal cat = new Cat("Garfield");
        cat.eat();
        Animal dog = new Dog("Snoopy");
        dog.eat();
    }
}
