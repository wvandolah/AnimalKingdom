package com.student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();


        animalList.add(new Mammals("Panda", 1869));
        animalList.add(new Mammals("Zebra", 1778));
        animalList.add(new Mammals("Koala", 1816));
        animalList.add(new Mammals("Sloth", 1806));
        animalList.add(new Mammals("Armadillo", 1758));
        animalList.add(new Mammals("Raccoon", 1758));
        animalList.add(new Mammals("BigFoot", 2021));

        animalList.forEach(a -> System.out.println(a.getYearNamed()));
    }
}
