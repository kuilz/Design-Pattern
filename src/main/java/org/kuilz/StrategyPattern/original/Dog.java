package org.kuilz.StrategyPattern.original;

public class Dog extends Animal{
    public Dog(){}
    public Dog(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(name+": "+"I am eating meat.");
    }
}
