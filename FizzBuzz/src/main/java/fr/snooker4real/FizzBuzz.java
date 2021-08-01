package fr.snooker4real;

import org.junit.jupiter.api.Test;

public class FizzBuzz {
    public String generate(int minNumber,int maxNumber){
        String result = evaluateNumber(minNumber);
        if (minNumber<maxNumber)
            result += evaluateNumber(maxNumber);
        return result;

    }

    private String evaluateNumber(int number){
        if (number % 15 == 0)
            return "FizzBuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        return String.valueOf(number);
    }

}
