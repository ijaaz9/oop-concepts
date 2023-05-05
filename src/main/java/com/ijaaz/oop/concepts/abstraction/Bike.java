package com.ijaaz.oop.concepts.abstraction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Bike {

    protected final Logger logger = LogManager.getLogger(this.getClass().getName());

    public Bike(){
        logger.info("Bike created...");
    }

    public abstract void run();
    public void changeGear(){logger.info("gear changed\n");}
}
