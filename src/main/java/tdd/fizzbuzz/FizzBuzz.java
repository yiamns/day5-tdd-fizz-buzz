package tdd.fizzbuzz;

public class FizzBuzz {
    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public static String generateFizzBuzzResult(int order) {
        if(order % (FIZZ_NUMBER * BUZZ_NUMBER) == 0) {
            return FIZZ + BUZZ;
        }
        else if(order % FIZZ_NUMBER == 0) {
            return FIZZ;
        }
        else if(order % BUZZ_NUMBER == 0) {
            return BUZZ;
        }
        else if(order > 0) {
            return String.valueOf(order);
        }
        else {
            return "";
        }
    }
}
