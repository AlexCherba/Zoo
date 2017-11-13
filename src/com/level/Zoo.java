package com.level;

import com.level.animal.Cat;
import com.level.animal.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public final static String[] WELCOME_CHANGE_ZOO = {
            "Желаете ли увеличить зоопарк?",
            "1. Да",
            "2. Нет"
    };

    public ArrayList animalZooList = new ArrayList();
    private String nameZoo;
    private int maxAnimalZoo;


    public Zoo(String nameZoo) {
        this.nameZoo = nameZoo;
//        initial Zoo, add default animals
        animalZooList.add(new Cat());
        animalZooList.add(new Dog());
        animalZooList.add(new Dog());
        animalZooList.add(new Cat());
    }

    public void setNameZoo(String nameZoo) {
        this.nameZoo = nameZoo;
    }

    public void setMaxAnimalZoo(int maxAnimalZoo) {
        this.maxAnimalZoo = maxAnimalZoo;
    }

    public void printAnimalZooList() {
        System.out.println("В зоопарке " + nameZoo + " находятся " + animalZooList.size() + " животных. А именно:");
        for (int i = 0; i < animalZooList.size(); i++) {
            IAnimal animalZoo = (IAnimal) animalZooList.get(i);
            System.out.println(animalZoo.getNameAnimalClass() + " " + animalZoo.getNameAnimal() + " " + animalZoo.getAgeAnimal() + " год(а) из "
                    + animalZoo.getAreaAnimalClass());
        }
    }

    public void addAnimalToZoo() {

        for (String i : WELCOME_CHANGE_ZOO) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                Main.exitFromCreator = false;
                break;
            default:
                Main.exitFromCreator = true;
                break;
        }

    }

}
