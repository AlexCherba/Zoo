package com.level;

import java.util.Scanner;

public abstract class Menu {
    final static String[] SELECT_ENTRY_ZOO = {
            "Создать зоопарк из файла?",
            "1. Да, использовать файл zoo.txt",
            "2. Нет, просто сгенерировать"
    };
    final static String[] ADD_NEW_ANIMAL = {
            "Добавить животное в зоопарк?",
            "1. Да",
            "2. Нет"
    };
    final static String[] SELECT_NEW_ANIMAL = {
            "Вы выбираете животное № "
    };
    final static String[] VIEW_ALL_CLASS_ANIMAL = {
            "Доступны животные:"
    };

    public void selectNewAnimal() {
        System.out.println(VIEW_ALL_CLASS_ANIMAL);

/*
        for (int i = 0; i < zoo.getAnimalZooList.size(); i++) {
            IAnimal animalZoo = (IAnimal) animalZooList.get(i);
            System.out.println(i + 1 + "." + animalZoo.getNameAnimalClass());
        }
        System.out.println(SELECT_NEW_ANIMAL);
        Scanner scanner = new Scanner(System.in);
        int classNewAnimal = scanner.nextInt();
*/

    }

    public static void selectZoo() {
        for (String i : SELECT_ENTRY_ZOO) {
            System.out.println(i);
        }


    }
}
