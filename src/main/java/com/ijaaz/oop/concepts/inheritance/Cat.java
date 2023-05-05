package com.ijaaz.oop.concepts.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat extends Animal{

    private final Logger logger = LogManager.getLogger(this.getClass().getName());

    public void meow(){
        logger.info("meowing...\n");
    }
}
