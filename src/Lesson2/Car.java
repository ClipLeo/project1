package Lesson2;

public class Car {

    int distance = 0;
    public void start() {
        System.out.println("Started");
    };

    public void stop(){
        System.out.println("Stopped");

    };
    public int drive(int howlong){
distance = howlong*60;
        return distance;
    };
}
