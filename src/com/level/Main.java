package com.level;

import com.level.animal.Cat;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static boolean exitFromCreator = false;
    static String fileNameZoo = "zoo.txt";

    static Zoo zoo;

    public static String getFileNameZoo() {
        return fileNameZoo;
    }
    public static void main(String[] args) throws FileNotFoundException {

//  View menu from select file or generate random Zoo
        Scanner scanner01 = new Scanner(System.in);

        Menu.selectZoo();

        while (true){
            switch (scanner01.nextInt()) {
                case 1:
                    zoo = new Zoo(FileUtils.read(fileNameZoo));
                    break;
                case 2:
                    System.out.println("Введите имя зоопарка");
                    Scanner scanner02 = new Scanner(System.in);
                    zoo = new Zoo(scanner02.nextLine());
                    //zoo.addAnimalToZoo();
                    break;
                default:
                    System.out.println("Не катит, 1 или 2 плиз!");
                    continue;
            }
            zoo.printAnimalZooList();
            break;
        }
    }
}
