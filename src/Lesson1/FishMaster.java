package Lesson1;

import Lesson1.Fish;

public class FishMaster {
public static void main(String args[]){

    Fish myFish = new Fish(20);

    myFish.dive(2);
    myFish.dive(97);
    myFish.dive(3);
    myFish.sleep();

    System.out.println(myFish.say("Hey!"));
        }
}
