package main.java;

public class FizzBuzz {
    public String generate(Integer upto) {
        String result = "";
        if(upto < 2) {
            return "1";
        } else {
            Integer i;
            for (i = 1; i <= upto; i++) {
                if (i % 3 != 0 || i % 5 != 0) {
                    if (i % 3 == 0) {
                        result += "Fizz, ";
                    } else if (i % 5 == 0) {
                        result += "Buzz, ";
                    } else {
                        result += i.toString() + ", ";
                    }
                } else {
                    result += "FizzBuzz, ";
                }
            }
            return result.substring(0, (result.length() -2));
        }

    }
}
