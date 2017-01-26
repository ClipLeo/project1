package Lesson3;

public class ProgramStart {

    ValidatorOfValues validator = new ValidatorOfValues();

    MVC data1 = new MVC(57, 'F');
    MVC data2 = new MVC(-57, 'R');
    MVC data3 = new MVC(-57, 'C');
    MVC data4 = new MVC(57, 'C');


    public void start() {
        count(data1);
        count(data2);
        count(data3);
        count(data4);
    }

    public void count(MVC data) {
        int temperature = data.temperature;
        char letter = data.letter;
        System.out.println(validator.validationMethod(temperature, letter));
    }


}

