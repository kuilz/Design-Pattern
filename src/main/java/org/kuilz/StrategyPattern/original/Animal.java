package org.kuilz.StrategyPattern.original;

public class Animal {
    public String name;
    public Animal(){}
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+": "+"I am eating something.");
    }
}
