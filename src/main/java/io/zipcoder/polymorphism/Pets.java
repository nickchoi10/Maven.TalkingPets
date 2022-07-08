package io.zipcoder.polymorphism;

public abstract class Pets {
    String name;
    public void Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String speak();
    }



