package com.sdajava.PatternStrategy2;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Mechanik");
        worker1.execute();

        Worker worker2 = new Worker("Doktor");
        worker2.execute();
    }
}
