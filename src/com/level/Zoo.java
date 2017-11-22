package com.level;

import com.level.animal.Cat;
import com.level.animal.Dog;
import com.level.exception.AgeException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    private ArrayList animalZooList = new ArrayList();

    private String nameZoo;
    private int maxAnimalZoo;

    public Zoo(ArrayList<String> stringFromFileArray) throws FileNotFoundException {
        createZooFromFile(stringFromFileArray);
    }

    public Zoo(String nameZoo) {
        this.nameZoo = nameZoo;
//        initial Zoo, add default animals
        animalZooList.add(new Cat());
        animalZooList.add(new Dog());
        animalZooList.add(new Dog());
        animalZooList.add(new Cat());
    }
    public static boolean checkAge(int age, int minAge, int maxAge) throws FileNotFoundException {
        try {
            if (minAge > age || age > maxAge) {
                throw new AgeException("Error Age (" + age + ")!!! Check animal's age in file zoo.txt");
            }
        }
        catch (AgeException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public void createZooFromFile(ArrayList<String> stringFromFileArray) throws FileNotFoundException {
        String[] strArray;
        int currentAge;
        int minAge;
        int maxAge;

        for (int i = 0; i < stringFromFileArray.size(); i++) {
            // The first element is Name Zoo
            if (i == 0) {
                this.nameZoo = stringFromFileArray.get(i);
                continue;
            }
            // Split Строки животного по сепаратору
            strArray = StringUtils.splitBySeparator(stringFromFileArray.get(i), ",");
            currentAge = Integer.parseInt(strArray[2]);
            //create animals from file array
            switch (strArray[0]) {
                case "Кот":
                    minAge = Cat.getMinAge();
                    maxAge = Cat.getMaxAge();
                    if (checkAge(currentAge, minAge, maxAge)) {
                        animalZooList.add(new Cat(strArray[0], strArray[1], Integer.parseInt(strArray[2]), strArray[3]));
                    }
                    break;
                case "Собака":
                    break;
                case "Лошадь":
                    break;
                case "Слон":
                    break;
                case "Крокодил":
                    break;
                default:
                    System.out.println("Нет в базе такого животного!");
                    break;
            }
        }

    }

    public void setAnimalZooList(ArrayList animalZooList) {
        this.animalZooList = animalZooList;
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
