package com.level;

import com.level.animal.Cat;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static boolean exitFromCreator = false;

    public static void main(String[] args){

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
        String textToFileZoo = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
        String fileNameZoo = "zoo.txt";

        FileUtils.write(fileNameZoo, textToFileZoo);

    }
}
