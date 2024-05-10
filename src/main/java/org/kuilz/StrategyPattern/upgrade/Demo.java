package org.kuilz.StrategyPattern.upgrade;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        EatBehavior eatFish = new EatFish();
        EatBehavior eatBone = new EatBone();
        EatBehavior eatMeat = new EatMeat();
        Animal cat = new Cat("Garfield");
        cat.setEatBehavior(eatMeat);
        cat.performEat();
        List<EatBehavior> eatBehaviors=new ArrayList<>();
        eatBehaviors.add(eatFish);
        eatBehaviors.add(eatBone);
        eatBehaviors.add(eatMeat);
        Animal dog = new Dog("Snoopy");
        for(EatBehavior eatBehavior:eatBehaviors){
            dog.setEatBehavior(eatBehavior);
            dog.performEat();
        }
    }
}
