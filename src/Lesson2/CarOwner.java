package Lesson2;

public class CarOwner {

    public static void main(String args[]){
        Car car = new Car();
        car.start();
        System.out.println(car.drive(50));
        car.stop();

        Car james = new JamesBondCar();
        james.start();
        System.out.println(james.drive(50));
        james.stop();
    }

}
