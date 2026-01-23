package com.m2i.course2;

sealed class AnimalSealed permits Dog, Cat {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}
final class Dog extends AnimalSealed {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark, I am a Dog");
    }
}
non-sealed class Cat extends AnimalSealed {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow, I am a cat");
    }
}
