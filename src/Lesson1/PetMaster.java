package Lesson1;

import Lesson1.Pet;

public class PetMaster {
    public static void main(String args[]){

        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Aloha! ");
        System.out.println(petReaction);
        myPet.sleep();

    }
}
