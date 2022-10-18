package edu.najah.eng.solid.di.assignment.devices;

import edu.najah.eng.solid.di.assignment.WindowsMachine;

public class Keyboard extends WindowsMachine {
    public void powerOn(){
        System.out.println("Power on " + this.getClass().getName());
    }

    public void powerOff(){
        System.out.println("Power off " + this.getClass().getName());
    }
}
