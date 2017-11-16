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

    @Override
    public void setAreaAnimalClass(String areaAnimalClass) {
        this.areaAnimalClass = areaAnimalClass;
    }

    @Override
    public String getNameAnimalClass() {
        return nameAnimalClass;
    }

    @Override
    public String getAreaAnimalClass() {
        return areaAnimalClass;
    }

}
