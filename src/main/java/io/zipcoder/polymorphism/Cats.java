package io.zipcoder.polymorphism;

public class Cats extends Pets {
    public Cats(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        return "meowww";
    }
}