package com.ijaaz.oop.concepts.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Animal {

    private final Logger logger = LogManager.getLogger(this.getClass().getName());
    public void eat(){
        logger.info("eating...");
    }
}
