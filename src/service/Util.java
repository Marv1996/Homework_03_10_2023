package service;

public class Util {

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int num) {
        int[] fibonacciArray = new int[num + 1];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        int numArray = 0;
        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            if (num == i) {
                numArray = fibonacciArray[i];
            }
        }
        return numArray;
    }
}
