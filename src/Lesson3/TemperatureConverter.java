package Lesson3;

public class TemperatureConverter {

    double endValue;
    String temp;


    public String convertTemptoF(int temperature) {

          endValue = (temperature - 32) / 1.8;
        temp = "Temperature in F:" + Double.toString(endValue);
        return temp;
    }

    public String convertTemptoC(int temperature){

        endValue=temperature*1.8+32;
        temp = "Temperature in C:" + Double.toString(endValue);
        return temp;

        }}