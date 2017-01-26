package Lesson1;

public class Pet {

    int age;
    float weight;
    float height;
    String color;
    private String aWord;

    public void sleep(){
        System.out.println("I'm sleep");
    }

    public void eat(){
        System.out.println("I'm hungry, lets eat the some shit");
    }

    public String say(String aWord){

        String petResponse = "Pidarases " + aWord;
        return petResponse;
    }
}

