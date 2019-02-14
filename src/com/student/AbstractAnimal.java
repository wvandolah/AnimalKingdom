package com.student;

public abstract class AbstractAnimal implements Animal{
    private static int maxId;
    private int id;
    private String name;
    private String move;
    private String breath;
    private String reproduce;
    private int yearNamed;

    public AbstractAnimal() {
        maxId++;
        this.id = maxId;
    }

    public AbstractAnimal(String name, String move, String breath, String reproduce, int yearNamed) {
        maxId++;
        this.name = name;
        this.id = maxId;
        this.move = move;
        this.breath = breath;
        this.reproduce = reproduce;
        this.yearNamed = yearNamed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearNamed() {
        return yearNamed;
    }

    @Override
    public String consume() {
        return "Eating the regular way";
    }

    @Override
    public String move() {
        return this.move;
    }

    @Override
    public String breath() {
        return this.breath;
    }

    @Override
    public String reproduce() {
        return this.reproduce;
    }
}
