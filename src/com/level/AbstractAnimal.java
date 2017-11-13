package com.level;

public abstract class AbstractAnimal implements IAnimal {

    private String areaAnimalClass = "Антарктида";         // среда обитания
    private String nameAnimalClass = "Чупакабра";         // имя класса животного

    public String say() {
        return "хрррр....";
    }

    public String goToToilet() {
        return "=^-^= срунь срунь";
    }

    public void setNameAnimalClass(String nameAnimalClass) {
        this.nameAnimalClass = nameAnimalClass;
    }

    public void setAreaAnimalClass(String areaAnimalClass) {
        this.areaAnimalClass = areaAnimalClass;
    }

    public String getNameAnimalClass() {
        return nameAnimalClass;
    }

    public String getAreaAnimalClass() {
        return areaAnimalClass;
    }

}
