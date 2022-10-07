package com.semmet;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  

/**
 * Hello world!
 */
public final class App {

    private static final Logger logger = LogManager.getLogger(App.class); 

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(System.getenv("CLASSPATH"));

        BasicConfigurator.configure();  
        logger.info("we are in logger info mode"); 
    }
}
