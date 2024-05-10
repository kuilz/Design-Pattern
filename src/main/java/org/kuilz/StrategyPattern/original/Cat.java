package org.kuilz.StrategyPattern.original;
public class Cat extends Animal{
    public Cat(){}
    public Cat(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(name+": "+"I am eating fish.");
    }
}
