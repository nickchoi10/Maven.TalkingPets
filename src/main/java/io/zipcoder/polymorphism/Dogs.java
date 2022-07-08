package io.zipcoder.polymorphism;

public class Dogs extends Pets {
    public Dogs (String name){
        this.name =name;
    }

    @Override
    public String speak() {
        return "grrrrr";

    }
}

