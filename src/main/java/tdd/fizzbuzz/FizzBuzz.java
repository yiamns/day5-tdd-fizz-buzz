package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int order) {
        if(order % 3 == 0 && order % 5 == 0) {
            return "fizzbuzz";
        }
        else if(order % 3 == 0) {
            return "fizz";
        }
        else if(order % 5 == 0) {
            return "buzz";
        }
        else if(order > 0) {
            return String.valueOf(order);
        }
        else {
            return "";
        }
    }
}
