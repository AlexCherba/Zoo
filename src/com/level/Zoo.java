package com.level;

import com.level.animal.Cat;
import com.level.animal.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    private ArrayList animalZooList = new ArrayList();
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

    public ArrayList getAnimalZooList() {
        return animalZooList;
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
            System.out.println(animalZoo.getNameAnimalClass() + " " + animalZoo.getName() + " " + animalZoo.getAge() + " год(а) из "
                    + animalZoo.getAreaAnimalClass());
        }
    }

/*
    public void addAnimalToZoo() {
        System.out.println("Доступные классы животных:");
        for (int i = 0 ; i < animalZooList.size(); i++) {
            IAnimal animalZoo = (IAnimal) animalZooList.get(i);
            System.out.println(i+1 + "." + animalZoo.getNameAnimalClass());
        }
        System.out.println("Выберите класс животного:");
        Scanner scanner = new Scanner(System.in);
        int classNewAnimal = scanner.nextInt();

    }
*/

}
