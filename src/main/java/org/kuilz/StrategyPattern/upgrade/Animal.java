package org.kuilz.StrategyPattern.upgrade;

public class Animal {
    public String name;
    private EatBehavior eatBehavior;
    public Animal(){}
    public Animal(String name){
        this.name=name;
    }

    public void setEatBehavior(EatBehavior eatBehavior){
        this.eatBehavior=eatBehavior;
    }
    public void performEat(){
        eatBehavior.eat(this.name);
    }
}
