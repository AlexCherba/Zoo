package com.level;

import com.level.animal.Cat;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static boolean exitFromCreator = false;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя зоопарка");
        Zoo zoo = new Zoo(scanner.nextLine());

        //zoo.printAnimalZooList();
        //System.out.println("");

        Menu.selectZoo();
        while (true){
            switch (scanner.nextInt()) {
                case 1:
                    String fileNameZoo = "zoo.txt";
                    System.out.println(FileUtils.read(fileNameZoo));
                    return;
                case 2:

                    //zoo.addAnimalToZoo();
                    break;
                default:
                    System.out.println("Не катит, 1 или 2 плиз!");
                    break;
            }
        }
    }
}
