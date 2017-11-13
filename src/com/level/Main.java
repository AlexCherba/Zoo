package com.level;

import com.level.animal.Cat;

import java.util.Scanner;

public class Main {
    static boolean exitFromCreator = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя зоопарка");
        Zoo zoo = new Zoo(scanner.nextLine());

        zoo.printAnimalZooList();
        System.out.println("");
        // display the array list
        System.out.println("Contents of al: " + zoo.animalZooList);

        System.out.println("");

        while (!exitFromCreator){
            zoo.addAnimalToZoo();
        }

    }
}
