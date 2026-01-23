package com.m2i.course2;

import java.util.LinkedHashSet;

public class SealedClasTest {


    public static void main(String[] args) {

        Python python=new Python();
        AnimalSealed animalSealed= new AnimalSealed();

        Dog dog=new Dog();

        python.makeSound();

        dog.makeSound();


    }



}

class Python extends Cat{
    @Override
    public void makeSound() {
        super.makeSound();

        System.out.println("I am a Python");
    }
}
