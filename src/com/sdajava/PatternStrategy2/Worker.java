package com.sdajava.PatternStrategy2;


public class Worker {

    Work work;
    FreeTime freeTime;
    Traveling traveling;

    public Worker(String workerName){
            switch (workerName) {
                case "Mechanik" :
                    this.work = new FixingCars();
                    this.freeTime = new Gim();
                    this.traveling = new Bike();
                    break;
                case "Doktor" :
                    this.work = new Healing();
                    this.freeTime = new Literature();
                    this.traveling = new Car();
                    break;

            }
    }

    public void execute (){
        work.work();
        freeTime.freeTime();
        traveling.travel();

    }
}
