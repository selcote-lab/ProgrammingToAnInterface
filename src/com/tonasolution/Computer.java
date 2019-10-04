package com.tonasolution;


interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    public void display(){
        System.out.println("Display through a monitor");
    }
}

class Projector implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through a projector");
    }
}

public class Computer {
    displayModule displayModule;

    public void setDm(displayModule displayModule) {
        this.displayModule = displayModule;
    }

    public void display(){
        displayModule.display();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        displayModule monitor = new Monitor();
        displayModule projector = new Projector();

        computer.setDm(monitor);
        computer.display();
        computer.setDm(projector);
        computer.display();
    }
}