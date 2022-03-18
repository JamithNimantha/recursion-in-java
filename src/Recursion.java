import java.util.Arrays;
import java.util.Random;

public class Recursion {

    public static void main(String[] args) {

        mendaAndDikkaSmoking(100);
    }

    /**
     * Example 1 Infinite Example
     */
    static void infiniteExample(){
        try {
            infiniteRecursion();
        } catch (StackOverflowError e) {
            System.err.println("StackOverFlowError is thrown!");
        }
    }

    /**
     * Example 3 Infinite Example
     */
    static void factorialExample(){
         int number = 3;
         System.out.printf("Factorial of the number %x is %s%n", number, factorial(number));
    }

    /**
     * Example 2 Infinite Example
     */
    static void sumOfNumbersExample(){
        System.out.printf("Sum is %s%n", sumOfNumbers(1,2,3,4,5));
    }


    /**
     * This is a infinite recursive function. This method will call itself
     * forever until the Stack Over Flow Exception throws.
     * @throws StackOverflowError if the method recurse too deeply
     */
    private static void infiniteRecursion() {
        System.out.println("This is a infinite recursion!");
        infiniteRecursion();
    }

    /**
     * This method is use to calculate the factorial of the number
     *
     * The factorial of a number is the function that multiplies the number
     * by every natural number below it. Factorial is not defined for negative numbers,
     * and the factorial of zero is one, 0! = 1
     *
     * Ex: 5! = 120 (1*2*3*4*5)
     *
     *
     * @param number positive number to find the factorial
     * @return factorial of the provided number
     */
    private static int factorial(int number){
        System.out.printf("number is %x%n", number);
        if (number > 0)
            return number * factorial(number -1 );
        else
            return 1;

    }

    /**
     * This method sums up the given array of integers.
     *
     * @param args list of numbers
     * @return sum of the list of numbers
     */
    private static int sumOfNumbers(int... args){
        if (args.length == 0)
            return 0;
        else
            return args[args.length-1] + sumOfNumbers(Arrays.copyOf(args, args.length-1));
    }

    static int mendaAndDikkaSmoking(int cigarPercentage) {
        System.out.printf("Cigar Percentage is %s%%%n", cigarPercentage);
        if (cigarPercentage > 0) {
            boolean isSomeOneComing = new Random().nextBoolean();
            if (!isSomeOneComing){
                cigarPercentage -= 5;
            }
            return mendaAndDikkaSmoking(cigarPercentage);
        } else {
            return -1;
        }
    }
}



