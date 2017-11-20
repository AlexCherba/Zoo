package com.level.animal;

import com.level.AbstractAnimal;
import com.level.exception.AgeException;

public class Cat extends AbstractAnimal {

    private String name;
    private int age;

    public static int getMinAge() {
        return minAge;
    }

    public static int getMaxAge() {
        return maxAge;
    }

    private static final int minAge = 0;
    private static final int maxAge = 18;

    public Cat() {
        this("Кот", "Васька", getRandomAge(minAge, maxAge), "Карпаты");
    }

    public Cat(String nameClass, String name, int age, String areaClass) {
        super.setNameAnimalClass(nameClass);
        this.name = name;
        this.age = age;
        super.setAreaAnimalClass(areaClass);
    }


    public static int getRandomAge(int minAge, int maxAge) {
        return minAge + (int) (Math.random() * (maxAge + 1));
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
