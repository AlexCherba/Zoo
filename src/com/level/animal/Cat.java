package com.level.animal;

import com.level.AbstractAnimal;

public class Cat extends AbstractAnimal {

    private String nameAnimal;
    private int ageAnimal;
    private int minAgeAnimal = 1;
    private int maxAgeAnimal = 18;
    private int randomAge = minAgeAnimal + (int) (Math.random() * (maxAgeAnimal + 1));

    public Cat() {
        super.setAreaAnimalClass("Карпаты");
        super.setNameAnimalClass("Кот");
        setNameAnimal("Васька");
        setAgeAnimal(randomAge);
    }

    public Cat(String name, int age) {
        this();
        setNameAnimal(name);                                    // Назначение собственного имя животного
        setAgeAnimal(age);                                      // Назначение возраста животного
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

}
