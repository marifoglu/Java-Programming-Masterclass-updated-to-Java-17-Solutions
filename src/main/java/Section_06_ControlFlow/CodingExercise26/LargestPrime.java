package Section_06_ControlFlow.CodingExercise26;

public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = -1;

        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
}