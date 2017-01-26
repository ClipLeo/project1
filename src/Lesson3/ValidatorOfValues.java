package Lesson3;


public class ValidatorOfValues {

    TemperatureConverter converter = new TemperatureConverter();

    String result;
    public String validationMethod(int temperature, char convertTo) {

        if (convertTo == 'F') {
            result = converter.convertTemptoF(temperature);
        } else if (convertTo == 'C') {
            result = converter.convertTemptoC(temperature);
        } else {
            result = "Another letter please";
        }return result;
    }
}

