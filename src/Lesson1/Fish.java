package Lesson1;

public class Fish extends Pet {
    int currentDepth =0;

    Fish(int startingPosition){
       currentDepth = startingPosition;
    }

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("I cant dive deeper");
        } else {

            System.out.println("Im Diving on " + howDeep + " feets");
            System.out.println("Im on depth " + currentDepth + " feets under sea level");
        }
        return currentDepth;
    }

    public String say(String something) {
        return "Do U know fishes don't speak";
    }
}
