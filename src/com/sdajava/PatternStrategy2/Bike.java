package com.sdajava.PatternStrategy2;

/**
 * Created by RENT on 2017-04-08.
 */
public class Bike implements Traveling {

    @Override
    public void travel() {
        System.out.println("Dojezdzam rowerem");
    }
}
