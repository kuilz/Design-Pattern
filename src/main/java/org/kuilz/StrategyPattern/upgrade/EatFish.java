package org.kuilz.StrategyPattern.upgrade;

public class EatFish implements EatBehavior{
    @Override
    public void eat(String name) {
        System.out.println(name+": "+"I am eating fish.");
    }
}
