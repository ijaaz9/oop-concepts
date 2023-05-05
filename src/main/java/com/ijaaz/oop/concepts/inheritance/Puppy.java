package com.ijaaz.oop.concepts.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Puppy extends Dog{

    private final Logger logger = LogManager.getLogger(this.getClass().getName());
    public void weep(){
        logger.info("Weeping...");
    }
}
