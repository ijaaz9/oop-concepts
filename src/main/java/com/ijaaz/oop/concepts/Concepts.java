package com.ijaaz.oop.concepts;

import com.ijaaz.oop.concepts.abstraction.Bike;
import com.ijaaz.oop.concepts.abstraction.Honda;
import com.ijaaz.oop.concepts.encapsulation.PersonWithLombok;
import com.ijaaz.oop.concepts.encapsulation.Student;
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
        logger.info("Standard Bank Interest Rate: "+bank.getRateOfInterest() + "\n");

        logger.info("Abstraction example...");
        Bike motorcycle = new Honda();
        motorcycle.run();
        motorcycle.changeGear();

        logger.info("Encapsulation Example...");
        Student student = new Student();
        student.setFistName("Lionel");
        student.setLastName("Messi");
        student.setAge(18);
        student.setStudentId(10);
        student.setGrade("12");
        logger.info(student.toString());

        logger.info("Encapsulation With Lombok Example...");
        PersonWithLombok pwl = new PersonWithLombok();
        pwl.setFirstname("Sebastian");
        pwl.setLastname("Vettel");
        pwl.setRace("White");
        pwl.setAge("35");
        logger.info(pwl.toString());
    }
}
