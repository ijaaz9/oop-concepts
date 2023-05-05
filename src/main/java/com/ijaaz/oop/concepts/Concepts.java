package com.ijaaz.oop.concepts;

import com.ijaaz.oop.concepts.inheritance.Cat;
import com.ijaaz.oop.concepts.inheritance.Dog;
import com.ijaaz.oop.concepts.inheritance.Puppy;
import com.ijaaz.oop.concepts.polymorphism.AbsaBank;
import com.ijaaz.oop.concepts.polymorphism.Bank;
import com.ijaaz.oop.concepts.polymorphism.FnbBank;
import com.ijaaz.oop.concepts.polymorphism.StandardBank;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Concepts {

    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(Concepts.class);

        logger.info("Single Inheritance");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        logger.info("Multilevel Inheritance");
        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.eat();
        puppy.bark();

        logger.info("Hierarchical Inheritance");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        logger.info("Polymorphism Example...");
        Bank bank;
        bank = new FnbBank();
        logger.info("FNB Interest Rate: "+bank.getRateOfInterest());
        bank = new AbsaBank();
        logger.info("ABSA Interest Rate: "+bank.getRateOfInterest());
        bank = new StandardBank();
        logger.info("Standard Bank Interest Rate: "+bank.getRateOfInterest());


    }
}
