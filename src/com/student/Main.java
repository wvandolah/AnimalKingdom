package com.student;

import java.util.ArrayList;

public class Main {
    public static void printAnimal(ArrayList<AbstractAnimal> animal, CheckAnimal tester){
        for( AbstractAnimal a : animal){
            if(tester.test(a)){
                System.out.println(a.getName() + " was named: " + a.getYearNamed());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animalList = new ArrayList<>();


        animalList.add(new Mammals("Panda", 1869));
        animalList.add(new Mammals("Zebra", 1778));
        animalList.add(new Mammals("Koala", 1816));
        animalList.add(new Mammals("Sloth", 1806));
        animalList.add(new Mammals("Armadillo", 1758));
        animalList.add(new Mammals("Raccoon", 1758));
        animalList.add(new Mammals("BigFoot", 2021));

        animalList.add(new Birds("Pigeon", 1837));
        animalList.add(new Birds("Peacock", 1821));
        animalList.add(new Birds("Toucan", 1758));
        animalList.add(new Birds("Parrot", 1824));
        animalList.add(new Birds("Swan", 1758));

        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        System.out.println("*** order by year named");
        animalList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
        animalList.forEach(a -> System.out.println(a.getName() + " was named: " + a.getYearNamed()));

        System.out.println("*** order by name");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(a -> System.out.println(a.getName() + " was named: " + a.getYearNamed()));

        System.out.println("*** order by move");
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach(a -> System.out.println(a.getName() + " was named: " + a.getYearNamed()));

        System.out.println("*** list only lungs");
        // this is the way i'd do it in JS
        animalList.forEach(a -> {
            if(a.breath() == "lungs"){
                System.out.println(a.getName() + " was named: " + a.getYearNamed());
            }
        });

        System.out.println("\n*** list only lungs and 1758");
        // this is the way he went over it in class
        printAnimal(animalList, a -> (a.getYearNamed() == 1758) && (a.breath().equals("lungs")));

        System.out.println("\n*** list only lay eggs and breath with lungs");
        printAnimal(animalList, a -> (a.breath().equals("lungs") && (a.reproduce().equals("eggs"))));

    }
}
