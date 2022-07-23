package io.zipcoder.polymorphism;

public class Pets {
    public String name;
    public void Pets(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setName(String name){ return this.name=name;}

    public String speak() {
        return "";
    }
}



